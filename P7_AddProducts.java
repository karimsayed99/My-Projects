package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class P7_AddProducts {
    private WebDriver driver;
    public P7_AddProducts(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement homepagevisibility() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }

    public WebElement clickproductsbtn() {
        return driver.findElement(By.xpath("//a[@href='/products']"));
    }

    public WebElement clickaddtocart() {
        return driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]"));
    }

    public WebElement clickcontinueshoppingbtn() {
        return driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']"));
    }

    public WebElement clickaddtocart2() {
        return driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]"));
    }

    public WebElement clickviewcartbtn() {
        return driver.findElement(By.xpath("//u[normalize-space()='View Cart']"));
    }

    public WebElement assertfirstproduct() {
        return driver.findElement(By.xpath("//a[normalize-space()='Blue Top']"));
    }

    public WebElement assertsecondproduct() {
        return driver.findElement(By.xpath("//a[normalize-space()='Men Tshirt']"));
    }

    public WebElement assertprice1() {
        return driver.findElement(By.xpath("//td[@class='cart_price']//p[contains(text(),'Rs. 500')]"));
    }

    public WebElement assertquantity1() {
        return driver.findElement(By.xpath("//tr[@id='product-1']//button[@class='disabled'][normalize-space()='1']"));
    }

    public WebElement asserttotalprice1() {
        return driver.findElement(By.xpath("//p[@class='cart_total_price'][normalize-space()='Rs. 500']"));
    }

    public WebElement assertprice2() {
        return driver.findElement(By.xpath("//td[@class='cart_price']//p[contains(text(),'Rs. 400')]"));
    }

    public WebElement assertquantity2() {
        return driver.findElement(By.xpath("//tr[@id='product-2']//button[@class='disabled'][normalize-space()='1']"));
    }

    public WebElement asserttotalprice2() {
        return driver.findElement(By.xpath("//p[@class='cart_total_price'][normalize-space()='Rs. 400']"));
    }

}
