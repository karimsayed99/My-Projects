package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_VerifyTcs {
    private WebDriver driver;

    public P4_VerifyTcs(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement asserthomepage() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }

    public WebElement clicktestcasesbtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Test Cases')]"));
    }

    public WebElement asserttestcasespage() {
        return driver.findElement(By.xpath("//b[normalize-space()='Test Cases']"));
    }

    public WebElement clickhomebtn() {
        return driver.findElement(By.xpath("//a[normalize-space()='Home']"));
    }

    public WebElement asserthomepage2() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }
    public WebElement clickproductsbtn() {
        return driver.findElement(By.xpath("//a[@href='/products']"));
    }
    public WebElement assertproductspage() {
        return driver.findElement(By.xpath("//img[@id='sale_image']"));
    }
    public WebElement clickviewproduct() {
        return driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]"));
    }
    public WebElement assertproductdetailspage() {
        return driver.findElement(By.xpath("//div[@class='view-product']//img[@alt='ecommerce website products']"));
    }
    public WebElement assertproductname() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Blue Top']"));
    }
    public WebElement assertcatagory() {
        return driver.findElement(By.xpath("//p[normalize-space()='Category: Women > Tops']"));
    }
    public WebElement assertprice() {
        return driver.findElement(By.xpath("//span[normalize-space()='Rs. 500']"));
    }
    public WebElement assertavailability() {
        return driver.findElement(By.xpath("//div[@class='product-details']//p[2]"));
    }
    public WebElement assertcondition() {
        return driver.findElement(By.xpath("//body//section//p[3]"));
    }
    public WebElement assertbrand() {
        return driver.findElement(By.xpath("//body//section//p[4]"));
    }

}