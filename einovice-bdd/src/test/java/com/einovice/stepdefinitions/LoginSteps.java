package com.stepdefinitions;

import com.einvoice.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user is on the login page")
    public void userOnLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        loginPage.open();
    }

    @When("the user enters valid username and password")
    public void userEntersCredentials() {
        loginPage.login("SuperAdmin", "admin", "ihh_doctors");
    }

    @Then("the user is taken to the dashboard")
    public void verifyDashboard() {
        assert driver.getTitle().contains("Invoice Factory");
        driver.quit();
    }
}
