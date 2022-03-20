package com.sel.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.get("https://www.amazon.com/");
        d.manage().window().maximize();
        String title = d.getTitle();
        System.out.println(title);
        String desired = "Amazon.com. Spend less. Smile more.";
        if (title.equals(desired)){
            System.out.println("pass");
        }else{
            System.out.println("fails");
        }
        d.quit();
    }
}
