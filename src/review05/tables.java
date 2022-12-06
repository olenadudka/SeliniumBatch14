package review05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tables {
    public static void main(String[] args) {

            //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            //create web driver instance
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
            //find the PIM button
            WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
            //click on it
            pimBtn.click();
            //find the Employee List
            WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
            //click on it
            employeeListBtn.click();


            //counter variable
            int rowCount = 0;
            boolean notFound = true;
            //a while loop continues to execute till the condition in parantesis is true
            while (notFound) {
                    //go to table look for the id 45156A and check the checkbox Associated with it
                    List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

                    for (WebElement id : idColumn) {
                            String personID = id.getText();

                            if (personID.equals("43024A")) {
                                    System.out.println("row number of our id " + (rowCount + 1));//we did just row number than check in DOM and figured out thAt we need add+1
                                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (rowCount + 1) + "]/td[1]"));
                                    checkBox.click();
                                    notFound = false;
                                    break;

                            }
                            rowCount = rowCount + 1;
                    }
                    if (notFound) {
                            WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                            nextBtn.click();
                            rowCount=0;
                    }
            }
    }

    }




