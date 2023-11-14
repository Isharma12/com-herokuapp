package comherokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 1. Setup Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */
public class ComHeroKuApp {
    public class MultiBrowserTest {
        static String browser = "Chrome";
        static String baseUrl = "http://the-internet.herokuapp.com/login";
        static WebDriver driver;

        public static void main(String[] args) {
            if (browser.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("Wrong Browser name");
            }

        }
    }
}
