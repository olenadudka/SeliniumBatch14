package com.Syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {
        https://jqueryui.com/droppable/
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open this website
        driver.get("https://jqueryui.com/droppable/");

        //switch the focus to the iframe
        driver.switchTo().frame(0);
        //        find the element drag
        WebElement dragableElem = driver.findElement(By.xpath("//div[@id='draggable']"));
        //drop location
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions=new Actions(driver);
       // actions.dragAndDrop(dragableElem,dropLocation).perform();
        //you can use this also
        actions.clickAndHold(dragableElem).moveToElement(dropLocation).release().build().perform();
    }
}
