package com.Syntax.class4;

import com.google.common.base.Verify;
import org.eclipse.jetty.util.security.Password;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
        /*
        HW 2
HRMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.

Hint:
you can use if else condition for verification of message (edited)
  */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to current url
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //maximize window
        driver.manage().window().maximize();
        //find the element username
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        //input text in username field
        username.sendKeys("Admin");
        WebElement login = driver.findElement(By.cssSelector("input.button"));
        //click on button
        login.click();
        //Verify error message with text “Password cannot be empty” is displayed.
        WebElement spanMessage = driver.findElement(By.cssSelector("span#spanMessage"));
        String message = spanMessage.getText();
        if(message.equals("Password cannot be empty")){
            System.out.println("Error message is correct");
        }else{
            System.out.println("Error message is not correct");
        }

    }
}
