package ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create web driver instance
        WebDriver driver=new ChromeDriver();
        //get to syntax/dHRMS
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //maximize window
        driver.manage().window().maximize();

        //when user send the username Admin
        WebElement userName = driver.findElement(By.id("txtUsername"));
        //send the userName
        userName.sendKeys("Admin");


        //then user sends in the wrong password
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("abracadabra");
        //then user clicks on login btn
        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();
//then verify the error "invalid credentions" is displayed
        //get the error message from DOM
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error=errorMsg.getText();

        //verification
        if(error.equalsIgnoreCase("Invalid credentials")){
            System.out.println("Correct error message is there");
        }else{
            System.out.println("Correct error message is not there");
        }
    }
}
