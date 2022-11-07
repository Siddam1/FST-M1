import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/simple-form");

        System.out.println("Tittle" + driver.getTitle());

        WebElement fname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));

        WebElement lname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));

        fname.sendKeys("Parameswari");

        lname.sendKeys("Devi");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));

        email.sendKeys("siddam.parameswari7@gmail.com");

        WebElement contact = driver.findElement(By.xpath("//*[@id=\"number\"]"));

        contact.sendKeys("6363479126");

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();

        System.out.println("submited");

    }
}
