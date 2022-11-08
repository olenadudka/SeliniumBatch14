package com.Syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to current url
        driver.get("https://www.ebay.com/");
        //maximize window
        driver.manage().window().maximize();
        //get all the links ie anchor tags from webside
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
        //print the size of list
        System.out.println("The size of the list is: "+ebayLinks.size());

        //implementing for loop to traverse through the list of webelements
        for(WebElement ebaylink: ebayLinks){
            //extracting the value of attribute href because it contains the link embedded in the Webelement
            String link=ebaylink.getAttribute("href");
            //print the link
            System.out.println(link);
        }
    }
}
