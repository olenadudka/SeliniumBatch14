package com.Syntax.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {
        /*
        go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //task go to gmail signup and get the window handle
        //get to website
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait
      //click on checkbox and click on remove
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        WebElement removeBtn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeBtn.click();
        //verify the text
        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));
        if(text.getText().equalsIgnoreCase("It's gone!")){
            System.out.println("Text is verified");
        }else{
            System.out.println("text is not verified");
        }
        //click on enable verify the textbox is enabled
        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBtn.click();
        WebElement textItsEnabled = driver.findElement(By.xpath("//p[@id='message']"));
        if(textItsEnabled.getText().equalsIgnoreCase("It's enabled!")){
            System.out.println("Text IT's enabled! verified");
        }else{
            System.out.println("Text is not verified");
        }
        //enter text and click disable
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("abracadabra");


        WebElement disableBtn = driver.findElement(By.xpath("//button[text()='Disable']"));
        disableBtn.click();
        //add explicit wait
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(enableBtn));
        WebElement message = driver.findElement(By.xpath("//p[@id='message']"));
        WebElement textBox1 = driver.findElement(By.xpath("//input[@type='text']"));
        boolean enabling = textBox1.isEnabled();

            System.out.println("Textbox is enable :"+enabling);

    }
}
