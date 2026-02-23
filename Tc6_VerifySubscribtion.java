package testCases;

import Pages.P5_SearchProduct;
import Pages.P6_VerifySubscribtion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Tc6_VerifySubscribtion {

    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();
    P6_VerifySubscribtion verify;

    @BeforeMethod
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        verify = new P6_VerifySubscribtion(driver);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test(priority = 1)
    public void VerifyhomeSubscribtion() {

        verify.asserthomepage().isDisplayed();
        verify.assertsubscribtion().isDisplayed();
        verify.enteremail().sendKeys("karimqandel@gmail.com");
        verify.clickarrow().click();
        verify.assertsuccessmessage().isDisplayed();

    }

    @Test(priority = 2)
    public void Verifycartsubscribtion() {

        verify.asserthomepage2().isDisplayed();
        verify.clickcartbtn().click();
        verify.assertsubscribtion2().isDisplayed();
        verify.enteremail2().sendKeys("karimqandel@gmail.com");
        verify.clickarrowbtn2().click();
        verify.assertsuccessmessage2().isDisplayed();
    }
    }
