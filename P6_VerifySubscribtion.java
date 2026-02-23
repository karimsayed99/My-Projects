package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_VerifySubscribtion {
    private WebDriver driver;
    public P6_VerifySubscribtion(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement asserthomepage() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }

    public WebElement assertsubscribtion() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Subscription']"));
    }

    public WebElement enteremail() {
        return driver.findElement(By.xpath("//input[@id='susbscribe_email']"));
    }

    public WebElement clickarrow() {
        return driver.findElement(By.xpath("//button[@id='subscribe']"));
    }

    public WebElement assertsuccessmessage() {
        return driver.findElement(By.xpath("//div[@class='alert-success alert']"));
    }

    public WebElement asserthomepage2() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }

    public WebElement clickcartbtn() {
        return driver.findElement(By.xpath("//a[normalize-space()='Cart']"));
    }

    public WebElement assertsubscribtion2() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Subscription']"));
    }

    public WebElement enteremail2() {
        return driver.findElement(By.xpath("//input[@id='susbscribe_email']"));
    }

    public WebElement clickarrowbtn2() {
        return driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']"));
    }

    public WebElement assertsuccessmessage2() {
        return driver.findElement(By.xpath("//div[@class='alert-success alert']"));
    }

}
