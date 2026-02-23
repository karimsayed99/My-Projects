package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Contactus {
    private WebDriver driver;
    public P3_Contactus(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement assertHomePage() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }
    public WebElement clickContactUs() {
        return driver.findElement(By.xpath("//a[normalize-space()='Contact us']"));
    }
    public WebElement assertGetInTouch() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Get In Touch']"));
    }
    public WebElement entername() {
        return driver.findElement(By.xpath("//input[@placeholder='Name']"));
    }
    public WebElement enteremail() {
        return driver.findElement(By.xpath("//input[@placeholder='Email']"));
    }
    public WebElement entersubject() {
        return driver.findElement(By.xpath("//input[@placeholder='Subject']"));
    }
    public WebElement entermessage() {
        return driver.findElement(By.xpath("//textarea[@id='message']"));
    }
    public WebElement uploadfile() {
        return driver.findElement(By.xpath("//input[@name='upload_file']"));
    }
    public WebElement clicksubmitbtn() {
        return driver.findElement(By.xpath("//input[@name='submit']"));
    }

    //

    public WebElement assertsuccesmessage() {
        return driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
    }
    public WebElement clickhomebtn() {
        return driver.findElement(By.xpath("//span[normalize-space()='Home']"));
    }
    public WebElement assertHomePage2() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }
}
