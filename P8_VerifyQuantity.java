package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P8_VerifyQuantity {
    private WebDriver driver;
    public P8_VerifyQuantity(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement asserthomepage() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }
    public WebElement clickviewproduct() {
        return driver.findElement(By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]"));
    }
    public WebElement assertproductsdetail() {
        return driver.findElement(By.xpath("//span[normalize-space()='Rs. 400']"));
    }
    public WebElement increasequantityto4() {
        return driver.findElement(By.xpath("//input[@id='quantity']"));
    }
    public WebElement clickaddtocartbtn() {
        return driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
    }
    public WebElement clickviewcartbtn() {
        return driver.findElement(By.xpath("//u[normalize-space()='View Cart']"));
    }
    public WebElement assertproduct() {
        return driver.findElement(By.xpath("//a[normalize-space()='Men Tshirt']"));
    }
}
