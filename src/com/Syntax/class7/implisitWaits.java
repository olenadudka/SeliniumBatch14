package com.Syntax.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implisitWaits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait
        //get to facebook
        driver.get("https://www.facebook.com/");
        //maximize window
        driver.manage().window().maximize();
        //click Create new account button
        WebElement createNewAccount = driver.findElement((By.xpath("//a[@data-testid='open-registration-form-button']")));
        createNewAccount.click();
        //send the firstname
        WebElement firstname = driver.findElement((By.xpath("//input[@name='firstname']")));
        firstname.sendKeys("abracadabra");

    }
}
