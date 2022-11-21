package com.Syntax.class8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //task go to gmail signup and get the window handle
        //get to google
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait
        //go to website
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        //maximize window
        driver.manage().window().maximize();

        //click the button that pops allert
        WebElement button1 = driver.findElement(By.xpath("//button[@id='alert']"));
        button1.click();

        //because we dont have a Webelement assosiated with alert in the DOM
        //so there is no purpose of using implisit wait(which waits for the WebElement to be found
        //so we use explisit wait in the
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        //handle the alert
        Alert alert1=driver.switchTo().alert();
        alert1.accept();
    }
}
