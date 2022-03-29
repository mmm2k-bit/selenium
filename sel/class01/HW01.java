package com.sel.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver f = new ChromeDriver();
        f.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement firstname = f.findElement(By.id("customer.firstName"));
        firstname.sendKeys("Emm");
        WebElement lastnmae = f.findElement((By.name("customer.lastName")));
        lastnmae.sendKeys("kay");
        WebElement address = f.findElement(By.id("customer.address.street"));
        address.sendKeys("123 north west");
        WebElement city = f.findElement(By.name("customer.address.city"));
        city.sendKeys("Austin");
        WebElement state = f.findElement(By.id("customer.address.state"));
        state.sendKeys("TX");
        WebElement zip = f.findElement(By.name("customer.address.zipCode"));
        zip.sendKeys("12345");
        WebElement phone = f.findElement(By.name("customer.phoneNumber"));
        phone.sendKeys("123-123-2345");
        WebElement ssn = f.findElement(By.id("customer.ssn"));
        ssn.sendKeys("123121245");
        WebElement username = f.findElement(By.name("customer.username"));
        username.sendKeys("qwert");
        WebElement password = f.findElement(By.id("customer.password"));
        password.sendKeys("Qwert123!");
        WebElement confirm = f.findElement(By.id("repeatedPassword"));
        confirm.sendKeys("Qwert123!");
        Thread.sleep(2000);
        f.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);
        f.close();



    }
}
