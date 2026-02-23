package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P_Trying {
    private WebDriver driver;
    public P_Trying(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement remember() {
        return driver.findElement(By.xpath("locator"));
    }
}
