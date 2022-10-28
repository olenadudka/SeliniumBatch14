package com.Syntax.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
        //open google.com
        //set the pass to the driver to link is with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required code
        driver.get("https://www.google.com/");
       // get the url of the website
        String url=driver.getCurrentUrl();
        //print url

        System.out.println(url);
        //get the title
        String title=driver.getTitle();
        //print the title
        System.out.println(title);
        //close the chrome
        driver.quit();
        driver.close();
    }
}
