package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testAnnotationExample {

    // go to facebook.com
    // enter the password
    // enter the username
    // click login
    // make sure the error is there

    @Test
    public void AtestingForfbText() { //It's alphabetical by default
    //  seting up the Webdriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    //  getting the particular url
        driver.get("https://fb.com");
        String text = driver.findElement(By.xpath("//h2")).getText();
        if (text.equals("Facebook helps you connect and share with the people in your life.")) {
            System.out.println("succesfull");
        } else {
            System.out.println("failed");
        }
        driver.quit();
    }
     // goto fb.com
     // make sure create account text is there

    @Test
    public void createAccountText() {
    //  seting up the Webdriver
        WebDriverManager.chromedriver().
                setup();
        WebDriver driver = new ChromeDriver();
    //  getting the particular url
        driver.get("https://fb.com");
        String text = driver.findElement(By.xpath("//a[text()='Create New Account']")).getText();

        if (text.equals("Create New Account")) {
            System.out.println("success");
        } else {
            System.out.println("failure");

        }
        driver.quit();
    }

}
