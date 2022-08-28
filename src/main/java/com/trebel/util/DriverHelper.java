package com.trebel.util;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static com.trebel.util.Configuration.BASE_URL;

public class DriverHelper {
    private static AndroidDriver driver = null;
    private static DesiredCapabilities capabilities;

    private DriverHelper() {
    }

    public static void setDriver(AndroidDriver driver) {
        DriverHelper.driver = driver;
    }

    private static DesiredCapabilities setCapabilities() {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName", "HONOR 20");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:udid", "NXEDU20211002453");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appium:appPackage", "com.mmm.trebelmusic");
        capabilities.setCapability("appium:appActivity", "com.mmm.trebelmusic.ui.activity.LauncherActivity");
        return capabilities;
    }

    public static AndroidDriver getDriver() throws MalformedURLException {
        if (driver == null) {
            driver = new AndroidDriver(new URL(BASE_URL), setCapabilities());
        }
        return driver;
    }
}
