package com.sel.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        d.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        d.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        d.findElement(By.id("ctl00_MainContent_login_button")).click();
        String teitle = d.getTitle();
//        System.out.println(teitle);
        String g = "Web Orders";
        if (teitle.equals(g)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        d.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);
        d.quit();
    }
}
