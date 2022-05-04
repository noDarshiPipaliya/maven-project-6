package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


    By welcomeText = By.xpath("//div[@id='headerPanel']");
    By usernameField = By.id("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]");
    By errorMessage = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");


    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterusername(String username){
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }


}
