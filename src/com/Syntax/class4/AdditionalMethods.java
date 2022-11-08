package com.Syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        //find the element button
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
        //get the text from button webelement
        String text=btn.getText();
        //print
        System.out.println(text);

        //get the value of the attribute"id" from the webElement
        String idvalue = btn.getAttribute("id");
        //print
        System.out.println(idvalue);
    }
}
