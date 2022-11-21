package com.Syntax.class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to syntax/dropdown
        driver.get("https://chercher.tech/practice/frames");
        //maximize window
        driver.manage().window().maximize();
//select baby cat and print Animals
        //switch to the frame using index
        driver.switchTo().frame(1);
        //print Animals
        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
       String text= animalText.getText();
        System.out.println(text);

        //to check inner frame checkbox
        //1 return to main(Switch focus to main
        driver.switchTo().defaultContent();
        //switch to the frame containing the subframe
        driver.switchTo().frame("frame1");
        WebElement inputText = driver.findElement(By.xpath("//input"));
        inputText.sendKeys("abracadabra");
//finding the frame through xpath and switching using by webelement method
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        //find the checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
        checkbox.click();



    }
}
