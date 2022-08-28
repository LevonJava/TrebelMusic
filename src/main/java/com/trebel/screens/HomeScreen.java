package com.trebel.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.trebel.util.MyMobilElement.click;
import static com.trebel.util.MyMobilElement.getText;

public class HomeScreen {
    private AndroidDriver driver;

    public HomeScreen (AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "imgMore")
    private MobileElement menu;
    @AndroidFindBy(id = "tvUserName")
    private MobileElement userName;

    public void clickOnMenu(){
        click(menu);
    }

    public String getUserName(){
        return getText(userName);
    }


}
