package ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to current url
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        //maximize window
        driver.manage().window().maximize();
        //find the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));
        //list contains all 6 webelements
        //treverse
        for(WebElement checkbox:checkboxes){
            //find something unique for each fild
            String color=checkbox.getAttribute("value");
            if(color.equalsIgnoreCase("blue")){
                checkbox.click();
                break;
            }
        }
    }
}
