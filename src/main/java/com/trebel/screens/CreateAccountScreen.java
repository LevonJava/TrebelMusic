package com.trebel.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.trebel.util.MyMobilElement.*;
import static com.trebel.util.WaitHelper.toBeVisible;

public class CreateAccountScreen {
    private AndroidDriver driver;

    public CreateAccountScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "etEmail")
    private MobileElement emailField;
    @AndroidFindBy(id = "etPassword")
    private MobileElement passwordField;
    @AndroidFindBy(id = "btnRegistration")
    private MobileElement registrationButton;
    @AndroidFindBy(id = "btn_back")
    private MobileElement goBackButton;
    @AndroidFindBy(id = "dialog_title")
    private MobileElement hasAccountTitle;
    @AndroidFindBy(id = "dialog_btn_cancel")
    private MobileElement createNewAccountButton;
    @AndroidFindBy(id = "dialog_btn_confirm")
    private MobileElement logInExistingAccount;

    public void enterEmail(String email) {
        toBeVisible(emailField);
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void enterPassword(String password) {
        toBeVisible(passwordField);
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnRegisterButton(){
        click(registrationButton);
    }

    public boolean isMessageDisplayed(){
        return isDisplayed(hasAccountTitle);
    }

    public void createNewAccount(){
        click(createNewAccountButton);
    }

    public void logInExistingAccount(){
        click(logInExistingAccount);
    }


}


