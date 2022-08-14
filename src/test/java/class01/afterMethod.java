package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class afterMethod {

//     goto facebook.com
    // make sure the text facebook helps u----- is there
    public static WebDriver driver;

    @Test
    public void AtestingForfbText(){

        String text = driver.findElement(By.xpath("//h2")).getText();
        if(text.equals("Facebook helps you connect and share with the people in your life.")){
            System.out.println("succesfull");
        }
        else
        {
            System.out.println("failed");
        }
        driver.quit();
    }

    // goto fb.com
    // make sure create account text is there

    @Test
    public void createAccountText() {

        String text = driver.findElement(By.xpath("//a[text()='Create New Account']")).getText();

        if (text.equals("Create New Account")) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }
    }

    @BeforeMethod // this allow us to use the repeated methods under @BeforeMethod - one code used for all tests
    public void settingupBrowser(){
        //  seting up the Webdriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();// always delete WebDriver driver in here once declared at the top
        // getting the particular url
        driver.get("https://fb.com");

    }

    @AfterMethod //quits all testes one code use for al test cases
    public void quitingThebrowser(){

        driver.quit();
    }
}

