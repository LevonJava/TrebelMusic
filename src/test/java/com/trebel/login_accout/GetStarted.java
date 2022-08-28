package com.trebel.login_accout;

import com.trebel.screens.CreateYourAccountScreen;
import com.trebel.screens.LoginScreen;
import com.trebel.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetStarted extends Base {
    LoginScreen loginScreen;
    CreateYourAccountScreen createYourAccountScreen;

    @Test(description = "TC-4")
    public void checkLogInButton() {
        createYourAccountScreen = new CreateYourAccountScreen(driver);
        loginScreen = new LoginScreen(driver);
        createYourAccountScreen.clickLogInButton();
        Assert.assertEquals(loginScreen.getWelcomeBackText(), "Welcome back!", "On the LoginScreen title is incorrect");
    }
}
