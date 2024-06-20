package day3;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
@Test
public class WarmUp {
    public void testSignUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://qa-duobank.us-east-2.elasticbeanstalk.com/register.php");

        Faker faker = new Faker();
        String first = faker.address().firstName();
        String last = faker.address().lastName();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(8,12,true,true);
        Thread.sleep(1000);


        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys(first, Keys.TAB, last, Keys.TAB, email, Keys.TAB, password,Keys.ENTER);
        Assert.assertTrue(driver.getPageSource().contains("Registration Successful"));

    }



}
