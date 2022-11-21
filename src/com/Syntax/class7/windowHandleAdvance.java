package com.Syntax.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandleAdvance {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //task go to gmail signup and get the window handle
        //get to google
        driver.get("http://accounts.google.com/signup");
        //maximize window
        driver.manage().window().maximize();
        //click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        //click on privacy BTN
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
privacyBtn.click();
//the title of my desired page is Google Account Help
        //get all window Handles
        Set<String> allHandles = driver.getWindowHandles();
        for(String handle:allHandles){
            //switching the focus to the current handle from list
            driver.switchTo().window(handle);
            //get the title of the window to switch the driver has switched
            String title=driver.getTitle();

            //compare if the title is of the help
            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println("The current page under focus is :"+title);
                break;
            }
        }
        //find the community button and click
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();
    }
}
