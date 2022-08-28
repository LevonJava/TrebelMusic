package com.trebel.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.trebel.util.MyMobilElement.click;
import static com.trebel.util.MyMobilElement.getText;
import static com.trebel.util.WaitHelper.toBeVisible;

public class LoginScreen {
    private AndroidDriver driver;

    public LoginScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.mmm.trebelmusic:id/welcome_back")
    private MobileElement welcomeBack;
    @AndroidFindBy(id = "com.mmm.trebelmusic:id/btn_fb")
    private MobileElement LogInWithFacebook;
    @AndroidFindBy(id = "com.mmm.trebelmusic:id/google")
    private MobileElement LogInWithGoogle;
    @AndroidFindBy(id = "com.mmm.trebelmusic:id/etEmail")
    private MobileElement emailField;
    @AndroidFindBy(id = "com.mmm.trebelmusic:id/etPassword")
    private MobileElement passwordField;
    @AndroidFindBy(id = "com.mmm.trebelmusic:id/btnLogin")
    private MobileElement logInButton;
    @AndroidFindBy(id = "com.mmm.trebelmusic:id/forgot_password")
    private MobileElement forgotYourPassword;
    @AndroidFindBy(id = "com.mmm.trebelmusic:id/btn_back")
    private MobileElement backButton;

    public String getWelcomeBackText(){
        return getText(welcomeBack);
    }

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

    public void login(){
        click(logInButton);
    }


}
