package com.Syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to current url
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        //maximize window
        driver.manage().window().maximize();
        //find the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        //treverse through the list of checkboxes to find desired one
        for(WebElement checkbox:checkboxes){
            // get the attribute value to check if this is the right option to select
          String optionName=  checkbox.getAttribute("value");
            //            if condition to make sure it is the right checkbox
          if(optionName.equalsIgnoreCase("Option-2")){
              //                if passed click on it
              checkbox.click();
          }
        }

    }
}
