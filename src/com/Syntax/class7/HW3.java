package com.Syntax.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW3 {
    public static void main(String[] args) {
        /*
        1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
2.Click on start button
3. get the text Welcome Syntax technologies and print on console

the text will be Empty

write down  whatever the reason you understand  of text being empty after exploring DOM
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //task go to gmail signup and get the window handle
        //get to google

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        //maximize window
        driver.manage().window().maximize();
        WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();
        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String welcomeSynt = text.getText();
        System.out.println("Text is: "+welcomeSynt);
    }
}
