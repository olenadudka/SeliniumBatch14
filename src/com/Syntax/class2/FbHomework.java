package com.Syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbHomework {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Queen");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Elizabeth");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("4587878555");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123fox&");




    }
}
