package com.Syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        /*
        Navigate to http://syntaxprojects.com/
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("practicing");
        driver.findElement(By.xpath("//button[contains(text(),'Message')]")).click();
        Thread.sleep(2000);
        driver.quit();
    }

}
