package com.Syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
       /*
       1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code
        */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        //filling out text boxes
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Elena");
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Dudka");
        WebElement mobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        mobile.sendKeys("125455852");
        WebElement password = driver.findElement(By.cssSelector("input#password_step_input"));
        password.sendKeys("abra123");
        //find the element dropdown by looking for select tag
        WebElement birthMonth = driver.findElement(By.cssSelector("select#month"));
        //use select class
        Select select=new Select(birthMonth);
        select.selectByVisibleText("Nov");
        WebElement birthDay = driver.findElement(By.xpath("//select[@id='day']"));
        Select select2=new Select(birthDay);
        select2.selectByValue("23");
        WebElement birthYear = driver.findElement(By.xpath("//select[@id='year']"));
        Select select3=new Select(birthYear);
        select3.selectByValue("1988");
        WebElement gender = driver.findElement(By.xpath("//input[@class='_8esa']"));
        gender.click();
    }
}
