package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_Register {
    private WebDriver driver;

    public P1_Register(WebDriver driver) {

        this.driver = driver;
    }
    public WebElement AssertHomePageVisibilty() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }
    public WebElement ClickSignupLoginbtn() {
        return driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
    }
    public WebElement AssertNewUserSignup() {
        return driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));
    }
    public WebElement EnterName() {
        return driver.findElement(By.xpath("//input[@placeholder='Name']"));
    }
    public WebElement EnterEmail() {
        return driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
    }
    public WebElement ClickSignUpbtn() {
        return driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
    }

    public WebElement Assertenteraccountinformation() {
        return driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));
    }
    public WebElement Title() {
        return driver.findElement(By.cssSelector("label[for='id_gender1']"));
    }
    public WebElement password() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }
    public WebElement selectday() {
        return driver.findElement(By.xpath("//select[@id='days']"));
    }
    public WebElement selectmonth() {
        return driver.findElement(By.xpath("//select[@id='months']"));
    }
    public WebElement selectyear() {
        return driver.findElement(By.xpath("//select[@id='years']"));
    }
    public WebElement checkbox1() {
        return driver.findElement(By.xpath("//input[@id='newsletter']"));
    }
    public WebElement checkbox2() {
        return driver.findElement(By.xpath("//input[@id='optin']"));
    }
    public WebElement firstname() {
        return driver.findElement(By.xpath("//input[@id='first_name']"));
    }
    public WebElement lastname() {
        return driver.findElement(By.xpath("//input[@id='last_name']"));
    }
    public WebElement company() {
        return driver.findElement(By.xpath("//input[@id='company']"));
    }
    public WebElement address1() {
        return driver.findElement(By.xpath("//input[@id='address1']"));
    }
    public WebElement address2() {
        return driver.findElement(By.xpath("//input[@id='address2']"));
    }
    public WebElement country() {
        return driver.findElement(By.xpath("//select[@id='country']"));
    }
    public WebElement state() {
        return driver.findElement(By.xpath("//input[@id='state']"));
    }
    public WebElement city() {
        return driver.findElement(By.xpath("//input[@id='city']"));
    }
    public WebElement zipcode() {
        return driver.findElement(By.xpath("//input[@id='zipcode']"));
    }
    public WebElement mobilenumber() {
        return driver.findElement(By.xpath("//input[@id='mobile_number']"));
    }
    public WebElement createaccountbtn() {
        return driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
    }
    public WebElement Assertaccountcreated() {
        return driver.findElement(By.xpath("//b[normalize-space()='Account Created!']"));
    }
    public WebElement continuebtn() {
        return driver.findElement(By.xpath("//a[normalize-space()='Continue']"));
    }
    public WebElement Assertloggedinasusername() {
        return driver.findElement(By.xpath("//li[10]//a[1]"));
    }
    public WebElement deleteaccountbtn() {
        return driver.findElement(By.xpath("//a[normalize-space()='Delete Account']"));
    }
    public WebElement Assertaccountdeleted() {
        return driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']"));
    }
    public WebElement clickcontinuebtn() {
        return driver.findElement(By.xpath("//a[normalize-space()='Continue']"));
    }

    //

    public WebElement AssertHomePageVisibilty2() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }
    public WebElement ClickSignupLoginbtn2() {
        return driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
    }
    public WebElement AssertNewUserSignup2() {
        return driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));
    }
    public WebElement EnterName2() {
        return driver.findElement(By.xpath("//input[@placeholder='Name']"));
    }
    public WebElement EnterEmail2() {
        return driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
    }
    public WebElement ClickSignUpbtn2() {
        return driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
    }

}

