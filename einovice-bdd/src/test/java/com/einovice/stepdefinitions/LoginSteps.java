package com.einovice.stepdefinitions;


import com.einovice.pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

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
