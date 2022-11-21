package reviewClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");
        //maximize window
        driver.manage().window().maximize();
        //switch the focus of the driver to the parent iframe whose id is iframe1
        driver.switchTo().frame("frame1");
        //switch the focus to the child frame

        driver.switchTo().frame(0);
        WebElement checkbox = driver.findElement(By.id("a"));
        checkbox.click();
        //switch the focus to home content
        driver.switchTo().defaultContent();
        //switching to frame with dropdown
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);
        //find the select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dropDown);
        sel.selectByIndex(1);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        driver.findElement((By.xpath("//input"))).sendKeys("abracadabra");

    }
}
