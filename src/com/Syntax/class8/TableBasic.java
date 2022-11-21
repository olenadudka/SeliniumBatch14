package com.Syntax.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableBasic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //task go to gmail signup and get the window handle
        //get to website
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //maximize window
        driver.manage().window().maximize();
      //print whole table in console
        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
       // String textAllTable = allTable.getText();
       // System.out.println(textAllTable);
        //print of the rows of the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for(WebElement row: rows){
            String rowText = row.getText();
           // System.out.println(rowText);
          //  System.out.println("----------------");
            //modified task: print only the row which have company google
            if(rowText.contains("Google")){
                System.out.println(rowText);
            }
        }
//print all individual colums in the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns){
            String columnText=column.getText();
            System.out.println(columnText);
            System.out.println("--------------------");
        }
    }
}
