import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1
{
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-controls");

        System.out.println("Tittle" + driver.getTitle());

        WebElement element = driver.findElement(By.className("willDisappear"));

        System.out.println(element.isDisplayed());

        driver.findElement(By.id("toggleCheckbox")).click();

       System.out.println(element.isDisplayed());

                driver.close();

    }
}
