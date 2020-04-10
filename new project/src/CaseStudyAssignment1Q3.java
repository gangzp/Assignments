import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class CaseStudyAssignment1Q3 {
    public WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Career\\Chrome 1\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/droppable/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }
    @Test
    public void assignment1Q3() throws InterruptedException {
        WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(draggable, droppable).build().perform();
        System.out.println("Confirmation Message : " + droppable.getText());
        Thread.sleep(2000);
    }
    @AfterTest
    public void closeBrowser()
        {
            driver.quit();
        }
}