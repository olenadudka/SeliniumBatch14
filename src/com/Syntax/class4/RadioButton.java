package com.Syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        // check if the radio btn is displayed
        boolean displayStatus = maleRadioBtn.isDisplayed();
        //print
        System.out.println("The radio button is displayed: "+displayStatus);

        //check wether the radio button is Enabled
        boolean enableStatus=maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled: "+enableStatus);
        //check is selected
        boolean selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is selected: "+selectStatus);
        //check if button is not selected click on it
        if(!selectStatus){
            //perform a click operation on the radio button
            maleRadioBtn.click();
        }
        selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is selected: "+selectStatus);
    }
}

