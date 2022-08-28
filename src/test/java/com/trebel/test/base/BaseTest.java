package com.trebel.test.base;

import com.trebel.screens.GetStartedScreen;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

import static com.trebel.util.DriverHelper.getDriver;
import static com.trebel.util.DriverHelper.setDriver;

public class BaseTest {
    protected AndroidDriver driver;
    protected GetStartedScreen getStartedScreen;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        driver = getDriver();
        getStartedScreen = new GetStartedScreen(driver);
        getStartedScreen.clickGetStarted();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            setDriver(null);
        }
    }
}
