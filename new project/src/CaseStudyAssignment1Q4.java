import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Calendar;

public class CaseStudyAssignment1Q4 {

    public WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Career\\Chrome 1\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/datepicker/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }
    @Test
    public void assignment1Q4() throws InterruptedException {
        WebElement datepicker = driver.findElement(By.xpath("//*[@id='datepicker']"));
        datepicker.click();
        Thread.sleep(1000);
        //Code to select date using navigation to previous dates.
        /*String header=null;
        while(header!="April 1992") {
            driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]")).click();
            Thread.sleep(2000);
            header = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
            }
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]")).click();*/

        //Code to access dates using sendkeys
        datepicker.sendKeys("04/08/1992");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
        Thread.sleep(1000);
    }
    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }
}