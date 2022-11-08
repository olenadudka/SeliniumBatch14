package com.Syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        //https://syntaxprojects.com/basic-first-form-demo.php


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        //get the web element text box
      //  driver.findElement(By.cssSelector("input[placeholder *='Please enter']")).sendKeys("abracadabra");

        //another method of doing this
       WebElement textBox=driver.findElement(By.cssSelector("input[placeholder *='Please enter']"));
       textBox.sendKeys("abracadabra");

       //press button show message
        WebElement button = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
       button.click();
    }
}