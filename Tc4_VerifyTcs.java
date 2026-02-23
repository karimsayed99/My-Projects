package testCases;

import Pages.P3_Contactus;
import Pages.P4_VerifyTcs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Tc4_VerifyTcs {
    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();
    P4_VerifyTcs verify;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        verify = new P4_VerifyTcs(driver);
    }
    @AfterMethod
    public void closeBrowser() {
      driver.quit();
   }
    @Test(priority = 1)
    public void Contactus() {

        verify.asserthomepage().isDisplayed();
        verify.clicktestcasesbtn().click();
        verify.asserttestcasespage().isDisplayed();
        verify.clickhomebtn().click();
    }

    @Test(priority = 2)
    public void VerifyProducts() {

        verify.asserthomepage2().isDisplayed();
        verify.clickproductsbtn().click();
        verify.assertproductspage().isDisplayed();
        verify.clickviewproduct().click();
        verify.assertproductdetailspage().isDisplayed();
        verify.assertproductname().isDisplayed();
        verify.assertcatagory().isDisplayed();
        verify.assertprice().isDisplayed();
        verify.assertavailability().isDisplayed();
        verify.assertcondition().isDisplayed();
        verify.assertbrand().isDisplayed();
    }
}
