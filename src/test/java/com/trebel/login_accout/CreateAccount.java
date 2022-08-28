package com.trebel.login_accout;

import com.trebel.screens.CompleteYourProfile;
import com.trebel.screens.CreateAccountScreen;
import com.trebel.screens.CreateYourAccountScreen;
import com.trebel.screens.HomeScreen;
import com.trebel.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccount extends Base {
    protected CreateYourAccountScreen createYourAccountScreen;
    protected CreateAccountScreen createAccountScreen;
    protected CompleteYourProfile completeYourProfile;
    protected HomeScreen homeScreen;

    @BeforeMethod
    private void setScreens() {
        createYourAccountScreen = new CreateYourAccountScreen(driver);
        createAccountScreen = new CreateAccountScreen(driver);
        completeYourProfile = new CompleteYourProfile(driver);
        homeScreen = new HomeScreen(driver);
        createYourAccountScreen.createAccount();
    }

    @Test(description = "TC-2")
    public void createAccount() {
        createAccountScreen.enterEmail("08lyov91@gmail.com");
        createAccountScreen.enterPassword("mekk22");
        createAccountScreen.registrateUser();
        Assert.assertTrue(createAccountScreen.isMessageDisplayed());
    }
    @Test(description = "TC-3")
    public void createNewAccount() {
        createAccountScreen.enterEmail("baron17@mail.ru");
        createAccountScreen.enterPassword("777777");
        createAccountScreen.registrateUser();
        completeYourProfile.clickFinish();
        completeYourProfile.clickSkip();
        homeScreen.clickMenu();
        Assert.assertEquals(homeScreen.getUserName(), "baron17@mail.ru", "Wrong Username");
    }
}
