import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudyAssignment1Q6 {

    public WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Career\\Chrome 1\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/controlgroup/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
    @Test
    public void assignment1Q6() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='car-type-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='ui-id-4']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@for='transmission-standard']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@for='insurance']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[@class='ui-spinner-input'])[1]")).sendKeys("5");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[contains(@class,'ui-button')])[1]")).click();
        Thread.sleep(2000);
    }
    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }
}
