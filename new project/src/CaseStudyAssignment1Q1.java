import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import javax.swing.text.Document;

public class CaseStudyAssignment1Q1 {
    public WebDriver driver;
    @BeforeTest
        public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Career\\Chrome 1\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/selectable/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        }
    @Test
        public void assignment1Q1() throws InterruptedException {
        WebElement item1 = driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
        WebElement item2 = driver.findElement(By.xpath("//*[@id='selectable']/li[2]"));
        WebElement item3 = driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
        WebElement item4 = driver.findElement(By.xpath("//*[@id='selectable']/li[4]"));
        WebElement item5 = driver.findElement(By.xpath("//*[@id='selectable']/li[5]"));
        WebElement item6 = driver.findElement(By.xpath("//*[@id='selectable']/li[6]"));
        WebElement item7 = driver.findElement(By.xpath("//*[@id='selectable']/li[7]"));
        item1.click();
        System.out.println("First item name is: "+item1.getText());
        Thread.sleep(1000);
        item2.click();
        System.out.println("First item name is: "+item2.getText());
        Thread.sleep(1000);
        item3.click();
        System.out.println("First item name is: "+item3.getText());
        Thread.sleep(1000);
        item4.click();
        System.out.println("First item name is: "+item4.getText());
        Thread.sleep(1000);
        item5.click();
        System.out.println("First item name is: "+item5.getText());
        Thread.sleep(1000);
        item6.click();
        System.out.println("First item name is: "+item6.getText());
        Thread.sleep(1000);
        item7.click();
        System.out.println("First item name is: "+item7.getText());
        Thread.sleep(1000);
    }
    @AfterTest
            public void closeBrowser()
    {
        driver.quit();
    }
}