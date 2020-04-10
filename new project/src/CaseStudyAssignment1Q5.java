import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudyAssignment1Q5 {
    public WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Career\\Chrome 1\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/selectmenu/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }
    @Test
    public void assignment1Q5() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='speed-button']")).click();
        driver.findElement(By.xpath("//*[@id='ui-id-5']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='files-button']")).click();
        driver.findElement(By.xpath("//*[@id='ui-id-9']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='number-button']")).click();
        driver.findElement(By.xpath("//*[@id='ui-id-19']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='salutation-button']")).click();
        driver.findElement(By.xpath("//*[@id='ui-id-33']")).click();
        Thread.sleep(1000);
    }

    @AfterTest
     public void closeBrowser() {
        driver.quit();
    }
}
