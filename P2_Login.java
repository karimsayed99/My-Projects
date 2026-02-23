package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_Login {
    private WebDriver driver;
    public P2_Login(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement HomePageVisibility() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }
    public WebElement ClickSignupLoginBtn() {
        return driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
    }
    public WebElement LoginToYourAccountVisibility() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
    }
    public WebElement EnterEmail() {
        return driver.findElement(By.xpath("//input[@data-qa='login-email']"));
    }
    public WebElement EnterPassword() {
        return driver.findElement(By.xpath("//input[@placeholder='Password']"));
    }
    public WebElement ClickLoginBtn() {
        return driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    }
    public WebElement LoggedInAsUsernameVisibility() {
        return driver.findElement(By.xpath("//li[10]//a[1]"));
    }
    public WebElement ClickDeleteAccount() {
        return driver.findElement(By.xpath("//a[normalize-space()='Delete Account']"));
    }
    public WebElement AccountDeletedVisibility() {
        return driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']"));
    }

    //

    public WebElement HomePageVisibility2() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }
    public WebElement ClickSignupLoginBtn2() {
        return driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
    }
    public WebElement LoginToYourAccountVisibility2() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
    }
    public WebElement EnterEmail2() {
        return driver.findElement(By.xpath("//input[@data-qa='login-email']"));
    }
    public WebElement EnterPassword2() {
        return driver.findElement(By.xpath("//input[@placeholder='Password']"));
    }
    public WebElement ClickLoginBtn2() {
        return driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    }
    public WebElement EmailPasswordIncorrectVisibility() {
        return driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));
    }

    //

    public WebElement HomePageVisibility3() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }
    public WebElement ClickSignupLoginBtn3() {
        return driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
    }
    public WebElement LoginToYourAccountVisibility3() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
    }
    public WebElement EnterEmail3() {
        return driver.findElement(By.xpath("//input[@data-qa='login-email']"));
    }
    public WebElement EnterPassword3() {
        return driver.findElement(By.xpath("//input[@placeholder='Password']"));
    }
    public WebElement ClickLoginBtn3() {
        return driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    }
    public WebElement LoggedInAsUsernameVisibility3() {
        return driver.findElement(By.xpath("//li[10]//a[1]"));
    }
    public WebElement ClickLogout() {
        return driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
    }
    public WebElement AssertHomePage3() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
    }
}
