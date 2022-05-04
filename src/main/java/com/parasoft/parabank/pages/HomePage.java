package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {



        By loginLink = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]");
        By registerLink = By.xpath("//a[contains(text(),'Register')]");

        public void clickOnLoginLink(){
            clickOnElement(loginLink);
        }

        public void clickOnRegisterLink(){
            clickOnElement(registerLink);
        }


    }


