package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public By validationMessage = By.id("flash");

    public boolean isValidationMessageDisplayed () {
      return driver.findElement(validationMessage).isDisplayed();
    }

    public String getValidationMessage (){
        return driver.findElement(validationMessage).getText();
    }
}
