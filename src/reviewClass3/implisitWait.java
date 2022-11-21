package reviewClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implisitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //task go to gmail signup and get the window handle
        //get to google
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        //maximize window
        driver.manage().window().maximize();
        WebElement getNewUserBtn = driver.findElement(By.xpath("//button[text()='Get New User']"));
        getNewUserBtn.click();
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String name=firstName.getText();
        System.out.println(name);
    }
}
