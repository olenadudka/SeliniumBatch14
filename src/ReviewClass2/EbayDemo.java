package ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select sel=new Select(dropDown);
        sel.selectByValue("58058");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //verify the title
        String title = driver.getTitle();
        //or WebElement title = driver.findElement(By.xpath("//title"));
       // String titleText=title.getText();
        if(title.equalsIgnoreCase("Electronics, Cars, Fashion, Collectibles & More | eBay")){
            System.out.println("Title is verified");
        }else{
            System.out.println("Title not verified");
        }
    }
}
