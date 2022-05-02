package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLink(String text) {
        driver.findElement(By.linkText(text)).click();
    }

    public FormAuthenticationPage clickOnFormAuthentication () {
        clickOnLink("Form Authentication");
        return new FormAuthenticationPage(driver);
    }
}
