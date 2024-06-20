package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingCheckBoxes {
    @Test
    public void testCheckbox(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.carfax.com");
        driver.findElement(By.linkText("Used Car Values")).click();

//        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        WebElement checkbox =  driver.findElement(By.cssSelector(".checkbox-input_box"));
          if(!checkbox.isSelected()){
              checkbox.click();
          }

          
          //ElementClickInterceptedException: happens when an element is covered by another element
        //One way to fix is to click on the other element that covers it
        //Another way is to use Javascript click



    }
}
