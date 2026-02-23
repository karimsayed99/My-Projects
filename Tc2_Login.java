package testCases;

import Pages.P1_Register;
import Pages.P2_Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Tc2_Login {

    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();
    P2_Login login;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        login = new P2_Login(driver);
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
    @Test(priority = 1)
    public void ValidLogin() {

        login.HomePageVisibility().isDisplayed();
        login.ClickSignupLoginBtn().click();
        login.LoginToYourAccountVisibility().isDisplayed();
        login.EnterEmail().sendKeys("karimqandel@gmail.com");
        login.EnterPassword().sendKeys("123456789");
        login.ClickLoginBtn().click();
        login.LoggedInAsUsernameVisibility().isDisplayed();
        login.ClickDeleteAccount().click();
        login.AccountDeletedVisibility().isDisplayed();

    }
    @Test(priority = 2)
    public void InvalidLogin() {

        login.HomePageVisibility2().isDisplayed();
        login.ClickSignupLoginBtn2().click();
        login.LoginToYourAccountVisibility2().isDisplayed();
        login.EnterEmail2().sendKeys("karemqandil@gmail.com");
        login.EnterPassword2().sendKeys("12345678");
        login.ClickLoginBtn2().click();
        login.EmailPasswordIncorrectVisibility().isDisplayed();


    }

    @Test(priority = 3)
    public void Logout() {

        login.HomePageVisibility3().isDisplayed();
        login.ClickSignupLoginBtn3().click();
        login.LoginToYourAccountVisibility3().isDisplayed();
        login.EnterEmail3().sendKeys("karimqandel@gmail.com");
        login.EnterPassword3().sendKeys("123456789");
        login.ClickLoginBtn3().click();
        login.LoggedInAsUsernameVisibility3().isDisplayed();
        login.ClickLogout().click();
        login.AssertHomePage3().isDisplayed();


    }
}
