package com.sel.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03 {
    public static String url= "https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.cssSelector("input[name='customer.firstName']")).sendKeys("Emm");
        driver.findElement(By.cssSelector("form#customerForm>table[class='form2'] tr:nth-of-type(2)>td[width='20%']>input")).sendKeys("Kay");
        driver.findElement(By.xpath("//td[@width='20%']//child::input[@id='customer.address.street']")).sendKeys("123 main st");
        driver.findElement(By.xpath("//table[@class='form2']//descendant::input[@id='customer.address.city']")).sendKeys("austin");
        driver.findElement(By.cssSelector("td[width='20%'] [name='customer.address.state']")).sendKeys("TX");

        driver.findElement(By.xpath("//*[@id='customer.address.zipCode']")).sendKeys("23456");
        driver.findElement(By.cssSelector("table.form2>tbody>tr:nth-of-type(7)>td:nth-child(2)>input")).sendKeys("1233453456");
        driver.findElement(By.cssSelector("table.form2>tbody>tr:nth-of-type(8)>td:nth-child(2)>input")).sendKeys("123123216");
        driver.findElement(By.cssSelector("table.form2>tbody>tr:nth-of-type(10)>td:nth-child(2)>input")).sendKeys("werny56");
        driver.findElement(By.cssSelector("table.form2>tbody>tr:nth-of-type(11)>td:nth-child(2)>input")).sendKeys("Qwert123!!");
        driver.findElement(By.cssSelector("table.form2>tbody>tr:nth-of-type(12)>td:nth-child(2)>input")).sendKeys("Qwert123!!");
        driver.findElement(By.cssSelector("table.form2>tbody>tr:nth-of-type(13)>td:nth-child(2)>input")).click();
        driver.close();


    }
}
