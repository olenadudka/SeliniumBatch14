package com.Syntax.class7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            //create web driver instance
            WebDriver driver=new ChromeDriver();
            //task go to gmail signup and get the window handle
            //get to google
            driver.get("http://accounts.google.com/signup");
            //maximize window
            driver.manage().window().maximize();
            //get the window handle for the current page
        String gmailHandle = driver.getWindowHandle();
        //print
        System.out.println("The handle of the curent page is : "+gmailHandle);
    }
}
