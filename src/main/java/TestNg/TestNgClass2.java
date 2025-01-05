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
        //Navigate to url saucedemo.com
        driver.navigate().to("https://www.saucedemo.com/");
        //Enter the username = user-name
    WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
    userName.sendKeys("standard_user");
    //Enter thr password = secret_sauce
    WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
    password.sendKeys("secret_sauce");
    //After entering into both username and password click on the button
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
        //check whether logo is displayed or not
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
