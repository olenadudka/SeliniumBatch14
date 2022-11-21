package reviewClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class waits {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();


        //get to syntax
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        //maximize window
        driver.manage().window().maximize();
        //click on start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();


        //get the text out of the element
        WebElement textElement = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(textElement.getText());

        //explisit wait until webelement is displayed
        //until webelement is clickable
        //until element is selected
    }
}
