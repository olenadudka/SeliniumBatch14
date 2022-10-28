package com.Syntax.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver web=new ChromeDriver();
        web.get("https://www.amazon.com/");
        web.navigate().to("https://www.google.com/");
        web.navigate().refresh();
        String title=web.getTitle();
        if(title.equals("google")){
            System.out.println("match");
        }
        else{
            System.out.println("No match");
        }
        System.out.println(title);
       String url= web.getCurrentUrl();
        System.out.println(url);

    }
}
