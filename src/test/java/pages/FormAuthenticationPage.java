package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.SecureAreaPage;

public class FormAuthenticationPage {

    WebDriver driver;

    public FormAuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public By usernameField = By.id("username");
    public By passField = By.id("password");
    public By loginButton = By.cssSelector("button.radius");

    public void setUsername (String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPass (String pass) {
        driver.findElement(passField).sendKeys(pass);
    }

    public SecureAreaPage clickOnLoginButton () {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

}
