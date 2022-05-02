package org.example;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FormAuthenticationPage;
import pages.MainPage;
import pages.SecureAreaPage;




public class StepDefinitions {

    WebDriver driver;
    MainPage mainPage;
    FormAuthenticationPage formAutPage;
    SecureAreaPage secureAreaPage;


    @Given("^I open the Form Authentication  on the Internet website$")
    public void i_open_the_form_authentication_on_the_internet_website() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        mainPage = new MainPage(driver);
        FormAuthenticationPage formAutPage = mainPage.clickOnFormAuthentication();
    }

    @When("^I enter the valid (.+) and (.+)$")
    public void i_enter_the_valid_and(String username, String password)  {
       formAutPage = new FormAuthenticationPage(driver);
        formAutPage.setUsername(username);
        formAutPage.setPass(password);
        secureAreaPage = new SecureAreaPage(driver);
        SecureAreaPage secureAreaPage = formAutPage.clickOnLoginButton();
    }

    @Then("^I should see the validation message on the Secure Area page$")
    public void i_should_see_the_validation_message_on_the_secure_area_page() throws Throwable {
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);
        Assert.assertTrue(secureAreaPage.isValidationMessageDisplayed());
        Assert.assertTrue(secureAreaPage.getValidationMessage().contains("You logged into a secure area!"));
    }


    @Then("^I should see the error message for unsuccessful login$")
    public void i_should_see_the_error_message_for_unsuccessful_login() {
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);
        Assert.assertTrue(secureAreaPage.isValidationMessageDisplayed());
        Assert.assertTrue(secureAreaPage.getValidationMessage().contains("Your username is invalid!"));
    }

}
