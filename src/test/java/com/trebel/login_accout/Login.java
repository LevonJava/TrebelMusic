package com.trebel.login_accout;

import com.trebel.screens.CreateYourAccountScreen;
import com.trebel.screens.HomeScreen;
import com.trebel.screens.LoginScreen;
import com.trebel.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends Base {
    protected LoginScreen loginScreen;
    protected HomeScreen homeScreen;
    protected CreateYourAccountScreen createYourAccount;

    @BeforeMethod
    private void setLoginHomeAccountScreens() {
        loginScreen = new LoginScreen(driver);
        homeScreen = new HomeScreen(driver);
        createYourAccount = new CreateYourAccountScreen(driver);
        createYourAccount.clickLogInButton();
    }

    @Test
    private void loginWithAlreadyCreatedAccount() {
        loginScreen.enterEmail("08lyov91@gmail.com");
        loginScreen.enterPassword("mek222");
        loginScreen.login();
        homeScreen.clickMenu();
        Assert.assertEquals(homeScreen.getUserName(), "08lyov91@gmail.com", "Wrong username");
    }
}
