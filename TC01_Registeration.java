package stepDefinition;

import Pages.P01_Registeration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC01_Registeration {

    public static WebDriver driver;
    P01_Registeration Register;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://automationexercise.com/");
        Register = new P01_Registeration(); // initialize page object
    }

    @AfterMethod
            //public void quit() {
            driver.quit();
}

@Test(priority = 1)
public void validRegister() {

    Register.signup_loginBtn().click();
    Register.name().sendKeys("karim");
    Register.signup_email1().sendKeys("karemqandil99@gmail.com");
    Register.signupbutton().click();

    Register.password().sendKeys("123456");
    Register.firstname().sendKeys("asmaa");
    Register.lastname().sendKeys("sayed");
    Register.address().sendKeys("haram");
    Register.country().sendKeys("egypt");
    Register.state().sendKeys("giza");
    Register.city().sendKeys("giza2");
    Register.zipcode().sendKeys("1234");
    Register.mobilenumber().sendKeys("01156654664");
    Register.createaccount().click();
}

@Test(priority = 2)
public void invalidRegister() {

    Register.login().click();
    Register.name2().sendKeys("karim");
    Register.signup_email().sendKeys("karemqandil99@gmail.com");
    Register.signup_button().click();
}

@Test(priority = 3)
public void emptyRegister() {

    Register.login2().click();
    Register.name3().sendKeys(" ");
    Register.sign_up_email().sendKeys(" ");
    Register.sign_up_button().click();
}
}
