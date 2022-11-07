import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1
{
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-controls");

        System.out.println("Tittle" + driver.getTitle());

        //WebElement element = driver.findElement(By.className("input"));
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]"));
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));

        element2.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.invisibilityOf(element1));

        element2.click();

        wait.until(ExpectedConditions.visibilityOf(element1));
        element1.click();

        driver.close();

    }
}
