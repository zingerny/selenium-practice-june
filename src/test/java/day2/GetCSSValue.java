package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCSSValue {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.webstaurantstore.com/");
WebElement element = driver.findElement(By.xpath("   //button[@value='Search']"));
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getCssValue("font-family"));

        // Get location and size of element

        System.out.println(driver.findElement(By.xpath("//a[@data-testid='logo']")).getLocation());
        System.out.println(driver.findElement(By.xpath("//a[@data-testid='logo']")).getSize());
    }
}
