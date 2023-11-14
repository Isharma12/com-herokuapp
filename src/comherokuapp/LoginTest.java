package comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    static String baseUrl = " http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        //1. Setup Browser
        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);// get method is responsible to open the url

        driver.manage().window().maximize(); // to maximize the browser

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  // We give Implicit wait to driver
        // Print the title of the page
        System.out.println(driver.getTitle());
        //Print the current url
        System.out.println(driver.getCurrentUrl());
        //Print the page source
        System.out.println(driver.getPageSource());
        //Enter email to email field
        driver.findElement(By.id("username")).sendKeys("abc123@gmail.com");
        // Enter password to password field
        driver.findElement(By.name("password")).sendKeys("xyz456");
        // click on login button
        driver.findElement(By.id("Login")).click();
        //Print the current Url
        System.out.println(driver.getCurrentUrl());
        //Refresh the page
        driver.navigate().refresh();
        //Close the browser
        driver.quit();
    }
}
