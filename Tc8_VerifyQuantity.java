package testCases;

import Pages.P8_VerifyQuantity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Tc8_VerifyQuantity {
    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();
    P8_VerifyQuantity quantity;

    @BeforeMethod
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        quantity = new P8_VerifyQuantity(driver);
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void VerifyQuantity() {

        quantity.asserthomepage().isDisplayed();
        quantity.clickviewproduct().click();
        quantity.assertproductsdetail().isDisplayed();
        quantity.increasequantityto4().sendKeys("4");
        quantity.clickaddtocartbtn().click();
        quantity.clickviewcartbtn().click();
        quantity.assertproduct().isDisplayed();
    }
}
