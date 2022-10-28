package reviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxReview {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        //click on start practicing
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(2000);
        //click on demo using and operator in the path method1
        driver.findElement(By.xpath("//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();
        //click on demo using indexing method2
       // driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]")).click();

    }
}
