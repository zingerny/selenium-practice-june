package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathAdvanced {
@Test
    public void test() {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.carfax.com");
        driver.findElement(By.linkText("Used Car Values")).click();

        // all links <a>that  have class attributes //a[@class]
       //  all link <a> that DO NOT have  class attributes --> //a[not(@class)]
// locate element using a parent element:
driver.findElement(By.xpath("//div[@class='text-input vehicleInputFormStyle_vehicle-input-form__input__plate__gCjxu']//input[@type='text']")).sendKeys("VKT905");
//locate  element using its parent:
    driver.findElement(By.xpath("h2[contains(text(), 'Step 2 - Enter your VIN')]//parent::form"));

    //locate a non -unique element by finding its unique sibling that comes after it
    //syntax uniqueSibling//preceding-sibling::tagName
    //syntax uniqueSibling//following-sibling::label

    //HOW TO HANDLE A DYNAMIC ELEMENT
    //IS IT FULLY DYNAMIC? OR PARTIALLY STATIC ?
// ONLY if a there is a static part
// ex. //input[starts-with(@name,'name')];
// ex. //input[ends-with(@name,'name')];
// ex. //input[contains(@name,'name')];


}
}
