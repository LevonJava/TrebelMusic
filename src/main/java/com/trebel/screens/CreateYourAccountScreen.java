package com.trebel.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.trebel.util.MyMobilElement.click;
import static com.trebel.util.MyMobilElement.getText;

public class CreateYourAccountScreen {
    private AndroidDriver driver;

    public CreateYourAccountScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "create_free_account")
    private MobileElement createFreeAccountTitle;
    @AndroidFindBy(id = "btn_fb")
    private MobileElement continueWithFacebook;
    @AndroidFindBy(id = "google")
    private MobileElement continueWithGoogle;
    @AndroidFindBy(id = "tv_create_with_email")
    private MobileElement createAccountWithEmail;
    @AndroidFindBy(id = "already")
    private MobileElement login;

    public void clickLogInButton() {
        click(login);
    }

    public void createAccount() {
        click(createAccountWithEmail);
    }

    public String getAccountTitleText() {
        return getText(createFreeAccountTitle);
    }
}
