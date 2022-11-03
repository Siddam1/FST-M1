import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/simple-form");

        System.out.println("Tittle"+driver.getTitle());

        WebElement fname = driver.findElement(By.id("firstName"));

        WebElement lname = driver.findElement(By.id("lastName"));

        fname.sendKeys("Parameswari");

        lname.sendKeys("Devi");

        WebElement email = driver.findElement(By.id("email"));

        email.sendKeys("siddam.parameswari7@gmail.com");

        WebElement contact = driver.findElement(By.id("number"));

        contact.sendKeys("6363479126");

        driver.findElement(By.cssSelector(".ui.green.button")).click();

        System.out.println("submited");

        Thread.sleep(3000);

        //driver.close();

    }
}
