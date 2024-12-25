package TestNg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestNgClass2 extends TestNgClass1{
    WebDriver driver = new ChromeDriver();



    @Test
    public void TestCase1() {
        driver.navigate().to("https://www.saucedemo.com/");
    WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
    userName.sendKeys("standard_user");
    WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
    password.sendKeys("secret_sauce");
    WebElement button = driver.findElement(By.xpath("//input[@id='login-button']"));
    button.click();
    WebElement title = driver.findElement(By.xpath("//div[@class='app_logo']"));
    String actualCaption = title.getText();
    String expCaption= "Swag Labs";
    Assert.assertEquals(actualCaption, expCaption);
             System.out.println("");


    }
    @Test
    public void TestCase2(){


        WebElement item= driver.findElement(By.xpath("//a[@id='item_4_img_link']"));
        boolean isLogoDisplayed = item.isDisplayed();
        Assert.assertTrue(isLogoDisplayed);


        System.out.println("");
    }
    @Test
    public void TestCase3(){


        List<WebElement> clothes= driver.findElements(By.xpath("//div[@class='inventory_item']"));
        Assert.assertTrue(clothes.size() >=1 );
        Assert.assertTrue(clothes.size() == 6);

             System.out.println("");
    }
    @Test
    public void TestCase4(){

        List<WebElement> clothes= driver.findElements(By.xpath("//div[@class='inventory_item']"));
        Assert.assertTrue(clothes.size() >=1 );
        Assert.assertTrue(clothes.size() == 6);

        int index = 0;
        for(WebElement cloth :clothes) {
            index++;
            WebElement swagg = cloth.findElement(By.xpath("(//div[@class='inventory_item_price'])["+index+"]"));
            System.out.println(swagg.getText());
        }
        System.out.println("-----------Second time-----------\n");
        for(int i=1;i<=clothes.size();i++){
            WebElement swagg =driver.findElement(By.xpath("(//div[@class='inventory_item_price'])["+i+"]"));
            System.out.println(swagg.getText());

             System.out.println("");
}
}
}
