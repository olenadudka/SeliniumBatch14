package reviewClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {


        //setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //open fb
        driver.get("https://facebook.com/");
        //maximize window
        driver.manage().window().maximize();
        //before closing wait
        Thread.sleep(5000);
       // quit the browser
        driver.quit();

    }
}