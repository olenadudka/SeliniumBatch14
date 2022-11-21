package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //click on recruitment
        WebElement recruitment = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitment.click();
        //click on calendar button
        WebElement fromButtn = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        fromButtn.click();
        //choose date May 21 2020
        //choose month from dropdown May;
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
Select selectMonth=new Select(month);
selectMonth.selectByVisibleText("May");
//choose year from dropdown 2020
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear=new Select(year);
        selectYear.selectByVisibleText("2020");
//choose the date 21
        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        //treverse through all days
        for(WebElement day:days){
            String currentDate=day.getText();
            if(currentDate.equalsIgnoreCase("21")){
                day.click();
                break;
            }
        }


    }
}
