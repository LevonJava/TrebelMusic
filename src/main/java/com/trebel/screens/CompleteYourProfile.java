package com.trebel.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.trebel.util.MyMobilElement.click;

public class CompleteYourProfile {
    private AndroidDriver driver;

    public CompleteYourProfile(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "later")
    private MobileElement finishButton;
    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement skipButton;
    public void clickOnFinishButton() {
        click(finishButton);
    }

    public void clickOnSkipButton() {
        click(skipButton);
    }
}
