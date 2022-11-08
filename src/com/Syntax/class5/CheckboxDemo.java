package com.Syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to current url
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        //maximize window
        driver.manage().window().maximize();
        //find the checkbox
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        //click
        checkBox.click();

    }
}
