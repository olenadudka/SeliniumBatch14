package com.Syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //go to smart bear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //enter password
                driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
                //click login
        driver.findElement(By.className("button")).click();
        //make shure that title is correcr i.e Web Orders
    String title=    driver.getTitle();
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The titile is correct: "+title);
        }else{
            System.out.println("The title is incorrect: "+title);
        }
    }
}
