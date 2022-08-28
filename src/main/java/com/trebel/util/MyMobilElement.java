package com.trebel.util;

import io.appium.java_client.MobileElement;

public class MyMobilElement {

    private MyMobilElement() {
    }

    public static WaitHelper waitHelper = new WaitHelper();

    public static void click(MobileElement element) {
        waitHelper.toBeVisible(element);
        waitHelper.toBeClickable(element);
        element.click();
    }

    public static boolean isDisplayed(MobileElement element) {
        WaitHelper.toBeVisible(element);
        return element.isDisplayed();
    }

    public static String getText(MobileElement element) {
        WaitHelper.toBeVisible(element);
        return element.getText();
    }
}
