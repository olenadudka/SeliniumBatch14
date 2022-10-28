package com.Syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //go to fb
        driver.get("https://facebook.com/");
        //enter the username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abracadabra");
        //click on forgot password
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        driver.findElement(By.xpath("//button[contains(@type, 'sub')]")).click();


    }
}
