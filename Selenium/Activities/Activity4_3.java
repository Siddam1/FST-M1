import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3
{
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/target-practice");

        System.out.println("Tittle" + driver.getTitle());

        System.out.println(driver.findElement(By.xpath("//*[@id=\"third-header\"]")));

        System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color"));

        System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class"));

        System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText());

        driver.close();
    }
}
