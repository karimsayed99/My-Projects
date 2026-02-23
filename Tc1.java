package Test_Cases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P1;

import java.time.Duration;

public class Tc1 {
    private static final Logger log = LoggerFactory.getLogger(Tc1.class);

    //first 3 steps/lines

    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();
    P1 login;

    //"BeforeMethod" and 4 actions plus object

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.noon.com/egypt-en/");
        login = new P1(driver);
    }

//    @AfterMethod
//    public void closeBrowser() {
//        driver.quit();
//    }

//Test Annotation + Priority + Waiting method (Thread.sleep) + Actions

    @Test(priority = 1)
    public void login() throws InterruptedException {
 Thread.sleep(10000);
        login.login().click();
        login.login2().sendKeys("lujyahmed272@gmail.com");
        login.login3().click();
        login.login4().click();
        login.login5().sendKeys("Auto@group2");
        login.login6().click();

    }

    @Test (groups = {"smoke"})
    @Parameters ("username")
    public void searchproduct() throws InterruptedException {
        Thread.sleep(10000);
login.clicksearchbar().click();
login.searchiphone().sendKeys("iphone");
login.searchproduct().sendKeys(Keys.ENTER);


    }

//    @Test(priority = 2)
//    public void productdetails() {
//login.clickproductdetails().click();
//    }

    @Test(priority = 3)
    public void addtocart() throws InterruptedException {
        Thread.sleep(10000);
        login.addtocart().click();
    }

    @Test(priority = 4)
    public void removefromcart() throws InterruptedException {
        Thread.sleep(10000);
        login.addtocart2().click();
        login.clickonviewcart().click();
        login.removefromcart().click();
    }

    @Test(priority = 5)
    public void checkout() throws InterruptedException {
        Thread.sleep(10000);
        login.productdetails().click();
        login.addtocart3().click();
        login.viewcart().click();
        login.clickcheckout().click();
        login.clicklocation().click();
        login.confirmlocation().click();
        login.aptnmbr().sendKeys("12");
        login.building().sendKeys("kemo");
        login.addressnickname().sendKeys("home");
        login.directions().sendKeys("none");
        login.firstname().sendKeys("karim");
        login.lastname().sendKeys("sayed");
        login.phonenumber().sendKeys("56654664");
        login.clicksaveaddress().click();
    }
    @Test (priority = 6)
    public void changeLanguage() {
        login.changelanguage().click();
    }
}
