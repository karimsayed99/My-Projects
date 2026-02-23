package testCases;

import Pages.P5_SearchProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Tc5_SearchProduct {
    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();
    P5_SearchProduct searchproduct;

    @BeforeMethod
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        searchproduct = new P5_SearchProduct(driver);
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void SearchProduct() {

        searchproduct.homepagevisibility().isDisplayed();
        searchproduct.clickproductsbtn().click();
        searchproduct.assertallproducts().isDisplayed();
        searchproduct.searchbar().sendKeys("men tshirt");
        searchproduct.clicksearchbtn().click();
        searchproduct.assertsearchedproducts().isDisplayed();
        searchproduct.assertproduct().isDisplayed();
    }
}
