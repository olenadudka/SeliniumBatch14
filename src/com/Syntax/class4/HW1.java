package com.Syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
/*
HW1
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify the message "Welcome Admin " is there on the top right corner

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
        //find element passw
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        //type the password
        password.sendKeys("Hum@nhrm123");
        //find element submit button
        WebElement login = driver.findElement(By.cssSelector("input.button"));
        //click on button
        login.click();
        //verify the message "Welcome Admin " is there on the top right corner
        WebElement text = driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
        System.out.println("The message Welcome Admin is displayed: "+text.isDisplayed());
    }

}
