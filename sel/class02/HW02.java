package com.sel.class02;

import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://www.facebook.com/");

    }
}
