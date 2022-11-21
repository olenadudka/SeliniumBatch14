package com.Syntax.class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {
        /*
        http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
got to the url
click on PIM
click on Employee List
from the table choose one id (it must be from the first page)
and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
the user name is
admin
the password is
Hum@nhrm123
         */

        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //click on PIM
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimBtn.click();

       // from the table choose one id (it must be from the first page)
        //find the element with id column
        List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
//traverse through the list
        for(int i=0; i<idColumn.size();i++){
            String text=idColumn.get(i).getText();
            if(text.equalsIgnoreCase("44967A")){
                int rowNumber=i+1;
                System.out.println("Id 45019A is found on row number "+rowNumber);
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+rowNumber+"]/td[1]"));
                checkBox.click();
            }
        }
    }
}
