package review4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitReview {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //task go to gmail signup and get the window handle
        //get to website
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //maximize window
        driver.manage().window().maximize();
        //implisit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on help button
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        //click the button
        WebElement removeBtn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeBtn.click();
        //get the text
        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(text.getText());
        //
        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBtn.click();
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));


//        send text
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abracadabra");
    }
}


