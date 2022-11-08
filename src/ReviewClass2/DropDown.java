package ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to syntax/dropdown
       driver.get("https://facebook.com/");
        //maximize window
        driver.manage().window().maximize();
        //find the element dropdown by looking for select tag
        //find button creatre acc and click
        WebElement createAccount =  driver.findElement(By.partialLinkText("Create new account"));
        createAccount.click();
Thread.sleep(3000);
//select the date from down
       // approach to use select class
        //find the WebElement that contain select tag
        //2.Use Select class Select sel=new Select(WebElement)

        //find the WebElement that contain select tag
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

        //2.Use Select class Select sel=new Select(WebElement)
        Select sel=new Select(day);

        //we have 3 methods,we can use any:
        //1.select by index
        sel.selectByIndex(4);
        //select by visible text
        sel.selectByVisibleText("31");
        //select by value
        sel.selectByValue("16");

        //***********************
       // 1.find the web element
              //  2.use select class
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMonth=new Select(month);
        selectMonth.selectByVisibleText("Aug");

        //print all the avaliable months
        //get u all options with dropdown
        List<WebElement> options = selectMonth.getOptions();
        //traverse through the loop
        for(int i=0; i<options.size(); i++){
           String months= options.get(i).getText();
            System.out.println(months);
        }

    }
}
