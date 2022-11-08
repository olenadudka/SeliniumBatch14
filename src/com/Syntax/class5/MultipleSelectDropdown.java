package com.Syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to syntax/dropdown
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //maximize window
        driver.manage().window().maximize();
        //find the element that contains the select class
        //        find the WebElement that contains the select class
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

//        using select class
        Select sel=new Select(DD);

//        By index
        sel.selectByIndex(3);
//        by visible text
        sel.selectByVisibleText("Texas");
Thread.sleep(3000);
//deselect by index
        sel.deselectByIndex(3);

        //write down the code to select all options in the dropdown

        List<WebElement> options = sel.getOptions();
        for(int i=0; i<options.size(); i++){
            sel.selectByIndex(i);
        }
Thread.sleep(3000);
        sel.deselectAll();

        //how can we check if its multiselect or not using selenium
        boolean multiSelect = sel.isMultiple();
        System.out.println(multiSelect);
    }
}

