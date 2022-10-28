package reviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBreview {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[(@name='firstname')]")).sendKeys("zombi");
        driver.findElement(By.xpath("//input[(@name='lastname')]")).sendKeys("Drakula");
        //close window
        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png')]")).click();
    }
}
