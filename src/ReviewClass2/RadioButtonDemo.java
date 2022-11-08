package ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        //find the rAdio button it's same for all choices, it's right
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //traverse through the list
        for(WebElement radioBtn:radioBtns){
            //find the desired radio button, we can use even if it has numbers
String option=radioBtn.getAttribute("value");
if(option.equalsIgnoreCase("5 - 15")){
    //click on button
    radioBtn.click();;
}
        }
    }
}
