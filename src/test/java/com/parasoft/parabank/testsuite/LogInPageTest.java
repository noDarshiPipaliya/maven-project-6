package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterusername("prime123");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "The username and password could not be verified.";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message  displayed");
    }
    @Test
    public void verifyregistersuccessfull(){
        homePage.clickOnRegisterLink();
        //homePage.
        homePage.sendTextToElement(By.id("customer.firstName"),"Devanshi");
        homePage.sendTextToElement(By.id("customer.lastName"),"pipaliya");
        homePage.sendTextToElement(By.id("customer.address.street"),"watford");
        homePage.sendTextToElement(By.id("customer.address.city"),"watford");
        homePage.sendTextToElement(By.id("customer.address.state"),"watford");
        homePage.sendTextToElement(By.id("customer.address.zipCode"),"1234");
        homePage.sendTextToElement(By.id("customer.phoneNumber"),"1234567890");
        homePage.sendTextToElement(By.id("customer.ssn"),"43536");
        homePage.sendTextToElement(By.id("customer.username"),"devpip");
        homePage.sendTextToElement(By.id("customer.password"),"devanshi");
        homePage.sendTextToElement(By.id("repeatedPassword"),"devanshi");
        homePage.clickOnElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
    }

}
