package com.einovice.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage {
    private WebDriver driver;

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
