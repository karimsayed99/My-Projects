package testCases;

import Pages.P1_Register;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Tc1_Register {
    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();
    P1_Register register;

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));


    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        register = new P1_Register(driver);
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
    @Test(priority = 1)
    public void RegisterUser() {

        register.AssertHomePageVisibilty().isDisplayed();
        register.ClickSignupLoginbtn().click();
        register.AssertNewUserSignup().isDisplayed();
        register.EnterName().sendKeys("karim07");
        register.EnterEmail().sendKeys("karimqandel07@gmail.com");
        register.ClickSignUpbtn().click();
        register.Assertenteraccountinformation().isDisplayed();
        register.Title().isSelected();
        register.password().sendKeys("123456789");
        register.selectday().sendKeys("1");
        register.selectmonth().sendKeys("11");
        register.selectyear().sendKeys("1999");
        register.checkbox1().click();
        register.checkbox2().click();
        register.firstname().sendKeys("karim");
        register.lastname().sendKeys("sayed");
        register.company().sendKeys("ntg");
        register.address1().sendKeys("haram1");
        register.address2().sendKeys("haram2");
        register.country().sendKeys("egypt");
        register.state().sendKeys("cairo");
        register.city().sendKeys("giza");
        register.zipcode().sendKeys("12345");
        register.mobilenumber().sendKeys("01156654664");
        register.createaccountbtn().sendKeys(Keys.ENTER);
        register.Assertaccountcreated().isDisplayed();
        register.continuebtn().click();
        register.Assertloggedinasusername().isDisplayed();
        register.deleteaccountbtn().click();
        register.Assertaccountdeleted().isDisplayed();
        register.clickcontinuebtn().click();
    }
        @Test(priority = 2)
        public void RegisterEmail() {

        register.AssertHomePageVisibilty2().isDisplayed();
        register.ClickSignupLoginbtn2().click();
        register.AssertNewUserSignup2().isDisplayed();
        register.EnterName2().sendKeys("karim");
        register.EnterEmail2().sendKeys("karimqandel@gmail.com");
        register.ClickSignUpbtn2().click();
    }
}
