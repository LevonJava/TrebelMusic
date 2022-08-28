package com.trebel.util;

import io.appium.java_client.MobileElement;

public class MyMobilElement {

    private MyMobilElement() {
    }

    public static WaitHelper waitHelper = new WaitHelper();

    public static void click(MobileElement element) {
        waitHelper.toBeClickable(element);
        waitHelper.toBeVisible(element);
        element.click();
    }

    public static boolean isDisplayed(MobileElement element) {
        new WaitHelper().toBeClickable(element);
        WaitHelper.toBeVisible(element);
        return element.isDisplayed();
    }

    public static String getText(MobileElement element) {
        new WaitHelper().toBeClickable(element);
        WaitHelper.toBeVisible(element);
        return element.getText();
    }
}
