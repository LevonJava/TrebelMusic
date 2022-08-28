package com.trebel.login_accout;

import com.trebel.screens.LoginScreen;
import com.trebel.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetStarted extends Base {
    LoginScreen loginScreen;
    @Test(description = "TC-4")
    public void checkLogInButton() {
        loginScreen = new LoginScreen(driver);
        Assert.assertEquals(loginScreen.getWelcomeBackText(), "Welcome back!", "On the LoginScreen title is incorrect");
    }
}
