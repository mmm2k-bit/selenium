package com.sel.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver d = new ChromeDriver();
        d.get("https://www.amazon.com/");
        String url=d.getCurrentUrl();
        String title = d.getTitle();
        System.out.println(url);
        System.out.println(title);
        d.quit();


    }
}
