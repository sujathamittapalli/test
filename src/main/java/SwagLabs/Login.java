package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main (String[] Args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement UserName = driver.findElement(By.xpath("//input[@data-test='username']"));
        UserName.sendKeys("standard_user");
        WebElement Password = driver.findElement(By.xpath("//input[@data-test='password']"));
        Password.sendKeys("secret_sauce");

    }
}
