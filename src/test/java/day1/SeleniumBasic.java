package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        String currentUrl = driver.getCurrentUrl();
        String getTitle = driver.getTitle();
        System.out.println(currentUrl);
        System.out.println(getTitle);
        System.out.println(driver.getPageSource());
        driver.quit();// quites all open tabs
     //   driver.close();// only closes currently active tab not used usually

        driver.navigate().to("https://www.duotech.io/");
        Thread.sleep(500);
        driver.navigate().back();
        Thread.sleep(500);
        driver.navigate().refresh();


    }
}
