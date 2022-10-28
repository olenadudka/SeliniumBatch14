package com.Syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Pinguin");
        driver.findElement(By.id("customer.lastName")).sendKeys("Pororo");
        driver.findElement(By.id("customer.address.street")).sendKeys("13 Happy Street");
        driver.findElement((By.id("customer.address.city"))).sendKeys("Moon city");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("(757)77777785");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.username")).sendKeys("happyperson");
        driver.findElement(By.id("customer.password")).sendKeys("happy123#");
        driver.findElement(By.id("repeatedPassword")).sendKeys("happy123#");
        driver.findElement(By.className("button")).click();
        driver.close();
    }


}
