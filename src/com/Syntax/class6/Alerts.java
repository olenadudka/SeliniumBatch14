package com.Syntax.class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to syntax/dropdown
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        //maximize window
        driver.manage().window().maximize();
//find button click me for alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Thread.sleep(2000);
        //Handling the alert(click on ok)

        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();

        //find the button for confirmation allert and click
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();
        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.dismiss();

        //find the promt allert and send some text then assept
        WebElement promtAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promtAlert.click();
        //switch the focus to the alert
        Alert propm1=driver.switchTo().alert();
        propm1.sendKeys("abracadabra");
        propm1.accept();

}}
