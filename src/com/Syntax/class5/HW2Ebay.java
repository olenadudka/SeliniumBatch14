package com.Syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2Ebay {
    public static void main(String[] args) {
        /*
        1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        List<WebElement> categories = driver.findElements(By.xpath("//select[@class='gh-sb ' ]"));
for (WebElement category:categories){
    String name=category.getText();
    System.out.println(name);
    //select computer,tablets networking
    WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
    Select sel=new Select(dropDown);
    sel.selectByVisibleText("Computers/Tablets & Networking");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    //verify the title
    String title = driver.getTitle();
    System.out.println(title);
    if(title.equalsIgnoreCase("Computers/Tablets & Networking")){
        System.out.println("Title is verified");
    }else{
        System.out.println("Title is not verified");
    }
}

        }

    }

