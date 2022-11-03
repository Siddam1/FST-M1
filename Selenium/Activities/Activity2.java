import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2
{
    public static void main(String args[])
    {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");

        System.out.println(driver.getTitle());

        WebElement element = driver.findElement(By.id("about-link"));

        System.out.println("By id :"+element.getText());

        WebElement classname = driver.findElement(By.className("green"));

        System.out.println("By classname :"+ classname.getText());

        WebElement linktest = driver.findElement(By.linkText("About Us"));

        System.out.println("By linktest :"+ linktest.getText());

        WebElement csscollector = driver.findElement(By.cssSelector(".green"));

        System.out.println("By csscollector :"+ csscollector.getText());

        driver.close();
    }
}
