package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {
    //writing down my first test case
    @Test //Test annotation is used to indicate that this is a test case
        public void test () {
    System.out.println("heyy! iam a first test case");

        }
    // writing down another test case
     @Test(groups = "smoke")
     public void secondTestCase(){
        System.out.println ("heyy! iam a second test case");/* always click and run on the test if you want one
                                                             test case tested or if all click and run outside */
     }

     @Test // always add @Test for each test
     public void thirdTestCase() {
         System.out.println("heyy! iam a third test case");
     }

     // methods for better use
     @BeforeMethod // is used    - is used after test case
     public void beforeMethod(){
        System.out.println ("heyy! I AM A BEFORE METHOD");
     }

     @AfterMethod // is used to not repeat codes - before test case
     public void afterMethod(){
        System.out.println("heyy! I AM A AFTER METHOD");
    }

    }

