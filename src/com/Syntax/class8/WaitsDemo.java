package com.Syntax.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsDemo {
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
        //click on the button "change text to selenium webdriver"
        WebElement button1 = driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();
        //get the text Selenium Webdriver
        WebElement webDriverText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        System.out.println(webDriverText.getText());
        //task2
        //click on display button after 10 sec
        WebElement button2 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
       button2.click();
//as the button appears up after sometime so in order to click it or get text we need to define some explicit wait
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//button[@id='hidden']\"")));

        WebElement visibleBtn = driver.findElement(By.xpath("\"//button[@id='hidden']\""));
        visibleBtn.click();




    }
}
