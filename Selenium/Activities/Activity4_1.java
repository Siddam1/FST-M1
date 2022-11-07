import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");

        System.out.println("tittle :"+driver.getTitle());

        driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();

        System.out.println("new tittle :"+driver.getTitle());
    }
}
