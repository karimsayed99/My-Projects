package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static stepDefinition.
public class P01_Registeration {

    // Valid Registration Elements
    public WebElement signup_loginBtn() {
        return driver.findElement(By.cssSelector("i[class='fa fa-lock']"));
    }

    public WebElement name() {
        return driver.findElement(By.cssSelector("input[name='name']"));
    }

    public WebElement signup_email1() {
        return driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
    }

    public WebElement signupbutton() {
        return driver.findElement(By.cssSelector("button[data-qa='signup-button']"));
    }

    public WebElement password() {
        return driver.findElement(By.cssSelector("input[data-qa='password']"));
    }

    public WebElement firstname() {
        return driver.findElement(By.cssSelector("input[data-qa='first_name']"));
    }

    public WebElement lastname() {
        return driver.findElement(By.cssSelector("input[data-qa='last_name']"));
    }

    public WebElement address() {
        return driver.findElement(By.cssSelector("input[data-qa='address']"));
    }

    public WebElement country() {
        return driver.findElement(By.cssSelector("select[data-qa='country']"));
    }

    public WebElement state() {
        return driver.findElement(By.cssSelector("input[data-qa='state']"));
    }

    public WebElement city() {
        return driver.findElement(By.cssSelector("input[data-qa='city']"));
    }

    public WebElement zipcode() {
        return driver.findElement(By.cssSelector("input[data-qa='zipcode']"));
    }

    public WebElement mobilenumber() {
        return driver.findElement(By.cssSelector("input[data-qa='mobile_number']"));
    }

    //public WebElement createaccount() {
        return driver.findElement(By.cssSelector("input[data-qa='create-account']"));
    }

    // Invalid Registration Elements
    public WebElement login() {
        return driver.findElement(By.cssSelector("i[class='fa fa-lock']"));
    }

    public WebElement name2() {
        return driver.findElement(By.cssSelector("input[name='name']"));
    }

    public WebElement signup_email() {
        return driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
    }

    public WebElement signup_button() {
        return driver.findElement(By.cssSelector("button[data-qa='signup-button']"));
    }

    // Empty Registration Elements
    public WebElement login2() {
        return driver.findElement(By.cssSelector("i[class='fa fa-lock']"));
    }

    public WebElement name3() {
        return driver.findElement(By.cssSelector("input[name='name']"));
    }

    public WebElement sign_up_email() {
        return driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
    }

    public WebElement sign_up_button() {
        return driver.findElement(By.cssSelector("button[data-qa='signup-button']"));
    }
}
