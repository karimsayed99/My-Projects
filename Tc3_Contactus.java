package testCases;

import Pages.P1_Register;
import Pages.P3_Contactus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Tc3_Contactus {
    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();
    P3_Contactus contactus;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        contactus = new P3_Contactus(driver);
    }
//    @AfterMethod
//    public void closeBrowser() {
//        driver.quit();
//    }
    @Test(priority = 1)
    public void Contactus() {

        contactus.assertHomePage().isDisplayed();
        contactus.clickContactUs().click();
        contactus.assertGetInTouch().isDisplayed();
        contactus.entername().sendKeys("karim");
        contactus.enteremail().sendKeys("karimqandel@gmail.com");
        contactus.entersubject().sendKeys("asd");
        contactus.entermessage().sendKeys("asdf");
        contactus.uploadfile().sendKeys("\"C:\\Users\\hp\\Desktop\\47aba2a11a4631e2d6ee7b42f232bf40.jpg\"");
        contactus.clicksubmitbtn().click();
        contactus.assertsuccesmessage().isDisplayed();
        contactus.clickhomebtn().click();
        contactus.assertHomePage2().isDisplayed();
    }
}
