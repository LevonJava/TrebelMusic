package com.trebel.util;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static com.trebel.util.DriverHelper.getDriver;

public class WaitHelper {
    private static final int TIMEOUT;
    private static final WebDriverWait WAIT;

    static {
        TIMEOUT = 10;
        try {
            WAIT = new WebDriverWait(getDriver(), TIMEOUT);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void toBeClickable(MobileElement element) {
        WAIT.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void toBeVisible(MobileElement element) {
        WAIT.until(ExpectedConditions.visibilityOf(element));
    }
}
