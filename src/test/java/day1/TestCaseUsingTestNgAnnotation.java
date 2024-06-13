package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseUsingTestNgAnnotation {

    @Test
    public void testCase001(){
        WebDriver driver =  new ChromeDriver();

        try {

            driver.manage().window().maximize();
            driver.navigate().to("https://www.google.com/");

            WebElement searchBar = driver.findElement(By.id("APjFqb"));


            String expectedTerm = "dragon";
            String actualTerm = driver.getTitle();
            // searchBar.sendKeys("dog", Keys.ENTER); // to fail the test
            searchBar.sendKeys(expectedTerm, Keys.ENTER); // this test pass


//        if (actualTerm.contains(expectedTerm)) {
//            System.out.println(" pass");
//        } else {
//
//            throw new AssertionError("Test failed, the actual title is : " +  actualTerm + " expected term was: " + expectedTerm);
//        }


            String expectedTitle = expectedTerm + " - Google Search";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
            Assert.assertTrue(actualTitle.contains(expectedTerm));
        } finally {
            driver.quit();
        }


    }

@Test
    public void testCase002(){
WebDriver driver = null;
        try {
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.google.com/");

            WebElement searchBar = driver.findElement(By.id("APjFqb"));


            String expectedTerm = "dragon";
            String actualTerm = driver.getTitle();
            // searchBar.sendKeys("dog", Keys.ENTER); // to fail the test
            searchBar.sendKeys(expectedTerm, Keys.ENTER); // this test pass


//        if (actualTerm.contains(expectedTerm)) {
//            System.out.println(" pass");
//        } else {
//
//            throw new AssertionError("Test failed, the actual title is : " +  actualTerm + " expected term was: " + expectedTerm);
//        }


            String expectedTitle = expectedTerm + " -Google Search";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
            Assert.assertTrue(actualTitle.contains(expectedTerm));
        } finally {
            driver.quit();
        }


    }
}