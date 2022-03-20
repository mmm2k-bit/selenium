package com.sel.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.navigate().to("https://www.amazon.com/");
      d.manage().window().maximize(); //alows to maximize and to see the buttons back and forth
        d.manage().window().fullscreen(); //no back buttons


    }
}
