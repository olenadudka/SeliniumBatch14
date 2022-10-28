package com.Syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        /*
        got to fb.com
        enter UserName
        enter password
        click login
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
      //  go to fb
        driver.get("https://facebook.com/");
        //maximize window
        driver.manage().window().maximize();
        //enter the username in textbox
        driver.findElement(By.id("email")).sendKeys("abracadabra");
        //enter the password in textbox
        driver.findElement(By.id("pass")).sendKeys("123fjffdkd");
        //click login button
        driver.findElement(By.name("login")).click();
        //1.locate the element and send t usinng linkText locator
       // driver.findElement(By.linkText("Forgot password?")).click();
        //task3:
        //click on forgot password using Partial LinkText locator
     //   driver.findElement(By.partialLinkText("Forgot")).click();
    }
}
