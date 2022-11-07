import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2
{
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-controls");

        System.out.println("Tittle" + driver.getTitle());

        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));

        System.out.println(element.isSelected());

        element.click();

        System.out.println(element.isSelected());

        driver.close();

    }
}
