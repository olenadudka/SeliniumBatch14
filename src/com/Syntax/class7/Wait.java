package com.Syntax.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait
        //get to syntax
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        //maximize window
        driver.manage().window().maximize();
        //click on start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();
        //find the text
        WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text=welcomeText.getText();
        System.out.println("the text is :"+text);

        //implicit wait is going to wait until the element is found

    }
}
