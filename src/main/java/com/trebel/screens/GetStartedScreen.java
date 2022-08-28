package com.trebel.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.trebel.util.MyMobilElement.click;

public class GetStartedScreen {
    private AndroidDriver driver;

    public GetStartedScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "get_start")
    private MobileElement getStarted;

    public void clickGetStarted() {
        click(getStarted);
    }
}
