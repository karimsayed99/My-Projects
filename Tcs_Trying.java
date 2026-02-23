package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testCases.P_Trying;

import java.time.Duration;

public class Tcs_Trying {
    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();
    P_Trying register;

    @BeforeMethod
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        register = new P_Trying(driver);
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void register(){
        register.remember().sendKeys(Keys.ENTER);
    }

}
