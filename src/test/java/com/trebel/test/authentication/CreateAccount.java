package com.trebel.test.authentication;

import com.trebel.screens.CompleteYourProfile;
import com.trebel.screens.CreateAccountScreen;
import com.trebel.screens.CreateYourAccountScreen;
import com.trebel.screens.HomeScreen;
import com.trebel.test.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccount extends BaseTest {
    protected CreateYourAccountScreen createYourAccountScreen;
    protected CreateAccountScreen createAccountScreen;
    protected CompleteYourProfile completeYourProfile;
    protected HomeScreen homeScreen;

    @BeforeMethod
    private void initScreens() {
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
        createAccountScreen.clickOnRegisterButton();
        Assert.assertTrue(createAccountScreen.isMessageDisplayed());
    }
    @Test(description = "TC-3")
    public void createNewAccount() {
        createAccountScreen.enterEmail("baron18@mail.ru");
        createAccountScreen.enterPassword("777777");
        createAccountScreen.clickOnRegisterButton();
        completeYourProfile.clickOnFinishButton();
        completeYourProfile.clickOnSkipButton();
        homeScreen.clickOnMenu();
        Assert.assertEquals(homeScreen.getUserName(), "baron18@mail.ru", "Wrong Username");
    }
}
