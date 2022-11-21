package com.Syntax.class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW {
    public static void main(String[] args) {
        /*
        1.check the checkBox
2.Select BabyCat from drop dwon
3. Send text in text box "DONE"
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to syntax/dropdown
        driver.get("https://chercher.tech/practice/frames");
        //maximize window
        driver.manage().window().maximize();
//  //check the checkbox
        //1. switch to correct iframe
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        //2 find the checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
        checkbox.click();
        //Select BabyCat from drop dwon
        //1 back to main frame
        driver.switchTo().defaultContent();
        ////switch frame to frame with dropdown
        driver.switchTo().frame("frame2");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Baby Cat");
        //Send text in text box "DONE"
        //1 back to main frame
        driver.switchTo().defaultContent();
        //find correct frame
        driver.switchTo().frame("frame1");
        //find web element textbox
        WebElement textbox = driver.findElement(By.xpath("//input"));
        //send text to textbox
        textbox.sendKeys("DONE");

    }
}
