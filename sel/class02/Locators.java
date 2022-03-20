package com.sel.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver d= new ChromeDriver();
        d.get("https://www.facebook.com/");
        d.findElement(By.id("email")).sendKeys("sdfdsfsdfasdadd");
        d.findElementById("pass").sendKeys("Qwert123!!");
        d.findElementByName("login").click();
        Thread.sleep(2000);
//        d.findElementByLinkText("Forgot password?").click();
        d.findElementByPartialLinkText("Forgot").click();
        d.quit();

//
    }
}
