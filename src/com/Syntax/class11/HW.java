package com.Syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {
      /*  goto https://demo.guru99.com/test/simple_context_menu.html
        right click  on the button, select edit and handle the alert

        double click on the button and handle the alert*/

        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //        maximize
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClick).perform();
        //find Edit line
        WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
      edit.click();
      //switch to alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebDriverWait wait=new WebDriverWait(driver, 20);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//button[text()='Double-Click Me To See Alert']\"")));
//find double click button
        WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions action2=new Actions(driver);
        action2.doubleClick(doubleClick).perform();
        Alert alert2=driver.switchTo().alert();
        alert2.accept();

    }
}
