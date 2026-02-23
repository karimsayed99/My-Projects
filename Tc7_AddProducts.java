package testCases;

import Pages.P7_AddProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Tc7_AddProducts {

    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();
    P7_AddProducts addProducts;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        addProducts = new P7_AddProducts(driver);
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void AddProducts() throws InterruptedException {

        addProducts.homepagevisibility().isDisplayed();
        addProducts.clickproductsbtn().click();
        Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")));

        addProducts.clickaddtocart().click();
        soft.assertEquals(addProducts.clickcontinueshoppingbtn().click());
        addProducts.clickaddtocart2().click();
        addProducts.clickviewcartbtn().click();
        addProducts.assertfirstproduct().isDisplayed();
        addProducts.assertsecondproduct().isDisplayed();
        addProducts.assertprice1().isDisplayed();
        addProducts.assertquantity1().isDisplayed();
        addProducts.asserttotalprice1().isDisplayed();
        addProducts.assertprice2().isDisplayed();
        addProducts.assertquantity2().isDisplayed();
        addProducts.asserttotalprice2().isDisplayed();
    }
}
