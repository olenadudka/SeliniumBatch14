package com.Syntax.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW1 {
    public static void main(String[] args) {
        //go to http://accounts.google.com/signup, click on help and privacy button.
        // Click on community button.
       // Go to gmail.com page and enter your user name in form

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
        //click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        String createAccPage = driver.getWindowHandle();
  //click on community button
        ////the title of my desired page is Google Account Help
        //get all windows Handles
        Set<String> allHandles = driver.getWindowHandles();
        for(String handle:allHandles){
            driver.switchTo().window(handle);
            //get the title of the window to switch the driver has switched
            String title=driver.getTitle();
            //compare title with title of desired page
            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println("The correct page under focus is "+title);
                break;
            }
        }
        //find the community button and click
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

        //back to Create Account page
        driver.switchTo().window(createAccPage);
        //find username textbox
        WebElement username = driver.findElement(By.xpath("//input[@name='Username']"));
        username.sendKeys("olena2311");

    }
}
