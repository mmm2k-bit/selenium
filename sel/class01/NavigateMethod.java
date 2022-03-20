package com.sel.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.get("https://www.facebook.com/");
        d.navigate().to("https://www.google.com/");// can navigate between the pages?
        d.navigate().back();
        Thread.sleep(2000);
        d.navigate().forward();
        Thread.sleep(2000); ///to pause
        d.navigate();
        d.close(); //closes current tab
        d.quit(); //closes whole browser
    }
}
