package com.Syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Angelina");
        driver.findElement(By.xpath("//input[contains(@placeholder, 'name@ex')]")).sendKeys("angelina@gmail.com");
        driver.get("https://demoqa.com/buttons");
driver.findElement(By.xpath("//button[starts-with(@id, 'TbB')]")).click();
    }
}
