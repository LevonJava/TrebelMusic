package com.trebel.test.authentication;

import com.trebel.test.base.BaseTest;
import com.trebel.screens.CreateYourAccountScreen;
import com.trebel.screens.HomeScreen;
import com.trebel.screens.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends BaseTest {
    protected LoginScreen loginScreen;
    protected HomeScreen homeScreen;
    protected CreateYourAccountScreen createYourAccount;

    @BeforeMethod
    private void initLoginHomeAccountScreens() {
        loginScreen = new LoginScreen(driver);
        homeScreen = new HomeScreen(driver);
        createYourAccount = new CreateYourAccountScreen(driver);
        createYourAccount.clickLogInButton();
    }

    @Test(description = "TC-1")
    public void loginWithAlreadyCreatedAccount() {
        loginScreen.enterEmail("08lyov91@gmail.com");
        loginScreen.enterPassword("mek222");
        loginScreen.login();
        homeScreen.clickOnMenu();
        Assert.assertEquals(homeScreen.getUserName(), "08lyov91@gmail.com", "Wrong username");
    }

    @Test(description = "TC-5")
    public void loginWithoutPassword() {
        loginScreen.enterEmail("08lyov91@gmail.com");
        loginScreen.login();
        Assert.assertEquals(loginScreen.getErrorText(), "Please enter a password.", "Message result is incorrect");
    }

    @Test(description = "TC-6")
    public void loginInvalidEmail() {
        loginScreen.enterEmail("08lyov91gmail.com");
        loginScreen.enterPassword("mek111");
        loginScreen.login();
        Assert.assertEquals(loginScreen.getErrorText(), "Please enter a valid email address", "Message result is incorrect");
    }

    @Test(description = "TC-7")
    public void loginWithoutPasswordAndEmail() {
        loginScreen.login();
        Assert.assertEquals(loginScreen.getErrorText(), "Please enter a valid email address", "Message result is incorrect");
    }

    @Test(description = "TC-8")
    public void loginWithoutEmail() {
        loginScreen.enterPassword("mek111");
        loginScreen.login();
        Assert.assertEquals(loginScreen.getErrorText(), "Please enter a valid email address", "Message result is incorrect");
    }
    @Test(description = "TC-9")
    public void loginInvalidPassword() {
        loginScreen.enterEmail("08lyov91@gmail.com");
        loginScreen.enterPassword("mek");
        loginScreen.login();
        Assert.assertEquals(loginScreen.getErrorText(), "Password is too short. Must be at least 6 characters.", "Message result is incorrect");
    }

}
