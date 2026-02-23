package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1 {

    //Constructor
    private WebDriver driver;
    public P1(WebDriver driver)
    {
        this.driver = driver;
    }

//locators
    public WebElement login() {
        return driver.findElement(By.xpath("//button[@data-qa='btn_header_signInOrUp-header-desktop']//span[@class='UserMenuTrigger-module-scss-module_qt_XKW_userText'][normalize-space()='Log in']"));
    }
    public WebElement login2() {
        return driver.findElement(By.xpath("//input[@class=\"Input-module-scss-module_-NwXYG_input\"]"));
    }
    public WebElement login3() {

        return driver.findElement(By.xpath("//button[@id=\"login-submit\"]"));
    }
    public WebElement login4() {
        return driver.findElement(By.xpath("//button[@class=\"TabListV2-module-scss-module_qNf_fa_tabCtr\"]"));
    }
    public WebElement login5() {
       return driver.findElement(By.xpath("//input[@class=\"PasswordInput-module-scss-module_URbSyG_input\"]"));
    }
    public WebElement login6() {
        return driver.findElement(By.xpath("//button[@class='VeifySignInWithPasswordV2-module-scss-module_8pK92G_loginButton']"));
    }
public WebElement clicksearchbar() {

        return driver.findElement(By.xpath("//input[@id='search-input']"));
}
public WebElement searchiphone() {

        return driver.findElement(By.xpath("//input[@id='search-input']"));
}
public WebElement searchproduct() {

        return driver.findElement(By.xpath("//input[@id='search-input']"));
}
public WebElement clickproductdetails() {
        return driver.findElement(By.xpath("//h2[normalize-space()='starville Acne Prone Skin Facial Cleanser 100 ml']"));
}
public WebElement addtocart() {
        return driver.findElement(By.xpath("//div[@class='ProductCarouselDesktop-module-scss-module__PbTJVG__emblaContainer']//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]//button[1]//img[1]"));
}
    public WebElement addtocart2() {
        return driver.findElement(By.xpath("//div[@class='ProductCarouselDesktop-module-scss-module__PbTJVG__emblaContainer']//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]//button[1]//img[1]"));
    }
    public WebElement clickonviewcart() {
        return driver.findElement(By.xpath("//a[@data-qa='btn_cartLink-Header-Desktop']//span[@class='CartLinkBadge-module-scss-module__pQqb6W__counter'][normalize-space()='1']"));
    }
    public WebElement removefromcart() {

        return driver.findElement(By.xpath("//span[normalize-space()='Remove']"));
    }
    public WebElement productdetails() {
        return driver.findElement(By.xpath("//div[@id='v-sensor-component-6-1-module-productCarousel-']//h2[@title='starville Acne Prone Skin Facial Cleanser 100 ml'][normalize-space()='starville Acne Prone Skin Facial Cleanser 100 ml']"));
    }
    public WebElement addtocart3() {
        return driver.findElement(By.xpath("//div[@class='AddToCartWithQuanityV2-module-scss-module__Xq4BmW__wrapper']//div[@class='AddToCartWithQuanityV2-module-scss-module__Xq4BmW__firstSubtitle1'][normalize-space()='Add To Cart']"));
    }
    public WebElement viewcart() {
        return driver.findElement(By.xpath("//div[@class='QuickCartV2-module-scss-module__1L1Gma__buttonGroup QuickCartV2-module-scss-module__1L1Gma__fixedBottom']//span[@class='QuickCartV2-module-scss-module__1L1Gma__buttonText'][normalize-space()='View Cart']"));
    }


    public WebElement clickcheckout() {
        return driver.findElement(By.xpath("//button[@class='Button-module-scss-module__QUp3uq__button Button-module-scss-module__QUp3uq__primary']"));
    }

    public WebElement clicklocation() {
        return driver.findElement(By.xpath("//body/div[@id='overlay-portal']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]/span[1]"));
    }

    public WebElement confirmlocation() {
        return driver.findElement(By.xpath("//body/div[@id='overlay-portal']/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/button[1]/span[1]"));
    }

    public WebElement aptnmbr() {
        return driver.findElement(By.xpath("//body/div[@id='overlay-portal']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]"));
    }

    public WebElement building() {
        return driver.findElement(By.xpath("//body/div[@id='overlay-portal']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/input[1]"));
    }
    public WebElement addressnickname() {
        return driver.findElement(By.xpath("//body/div[@id='overlay-portal']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]"));
    }
    public WebElement directions() {
        return driver.findElement(By.xpath("//body/div[@id='overlay-portal']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/input[1]"));
    }
    public WebElement firstname() {
        return driver.findElement(By.xpath("//body/div[@id='overlay-portal']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]"));
    }
    public WebElement lastname() {
        return driver.findElement(By.xpath("//body/div[@id='overlay-portal']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/input[1]"));
    }
    public WebElement phonenumber() {
        return driver.findElement(By.xpath("//body/div[@id='overlay-portal']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
    }
    public WebElement clicksaveaddress() {
        return driver.findElement(By.xpath("//body/div[@id='overlay-portal']/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]/span[1]"));
    }
    public WebElement changelanguage() {
        return driver.findElement(By.xpath("//button[@data-qa=\"lnk_languageSelector_supportbar\"]"));
    }
}

