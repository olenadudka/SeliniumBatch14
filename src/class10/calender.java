package class10;

import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calender {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open this website
        driver.get("https://www.delta.com/");
                //click on the calendar
                WebElement calendar = driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();
        //get the month & check if it's the desired month,common for all monthes
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        boolean isFound=false;
        while (!isFound){
            String monthName = month.getText();
            if (monthName.equalsIgnoreCase("March")){
                List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
                for (WebElement date:dates){
                    String currentDate = date.getText();
                    if (currentDate.equalsIgnoreCase("15")){
                        date.click();
                        break;
                    }}
                System.out.println("I have found my desired month: "+monthName);
                isFound=true;
            }
            else {
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();

            }}}}