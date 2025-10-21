package com.einvoice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
//import io.cucumber.messages.types.Duration; 

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait1;

    


    @FindBy(id = "exampleInputEmail1")
    private WebElement usernameInput;

    @FindBy(id = "exampleInputPassword1") 
    private WebElement passwordInput;
    
    @FindBy(id = "exampleInputDomain1")
    private WebElement domainInput;

    
    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)); //added wait
    }

    public void open() {
        driver.get("https://uatif.advintek.com.my:643/");
    }

    public void login(String user, String pass, String domain) {
        usernameInput.sendKeys(user);
        passwordInput.sendKeys(pass);
        domainInput.sendKeys(domain);
        
        loginButton.click();
        
    }
}
