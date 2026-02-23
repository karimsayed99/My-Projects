package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P5_SearchProduct {
    private WebDriver driver;

    public P5_SearchProduct(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement homepagevisibility() {
        return driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
    }
    public WebElement clickproductsbtn() {
        return driver.findElement(By.xpath("//a[@href='/products']"));
    }
    public WebElement assertallproducts() {
        return driver.findElement(By.xpath("//h2[normalize-space()='All Products']"));
    }
    public WebElement searchbar() {
        return driver.findElement(By.xpath("//input[@id='search_product']"));
    }
    public WebElement clicksearchbtn() {
        return driver.findElement(By.xpath("//i[@class='fa fa-search']"));
    }
    public WebElement assertsearchedproducts() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Searched Products']"));
    }
    public WebElement assertproduct() {
        return driver.findElement(By.xpath("//div[@class='product-overlay']"));
    }

}
