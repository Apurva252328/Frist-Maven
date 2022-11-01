package org.example; // org.example is the package to store the java classes

import org.openqa.selenium.By; // importing a package of selenium
import org.openqa.selenium.WebDriver; // importing a package of selenium WebDriver
import org.openqa.selenium.chrome.ChromeDriver; // importing a package of chromeDriver

import java.text.SimpleDateFormat;

public class BasePage1 {

    protected static WebDriver driver;
    //imported selenium web driver interface using Maven dependency to perform automation task

    // main method of this class
    public static void main(String[] args) {

        //Set the path of the driver for the Chrome Browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");

        //creating object with chromedriver
        driver = new ChromeDriver();

        //returns timeStamp value corresponding to the given string
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());

        // printing value of timeStamp
        System.out.println(timeStamp);

        // To maximize a browser window
        driver.manage().window().maximize();

        //set application URL to navigate
        driver.get("https://demo.nopcommerce.com/");

        // Click on register button
        driver.findElement(By.className("ico-register")).click();

        //Go to FirstName text field and type value of sendKeys
        driver.findElement(By.id("FirstName")).sendKeys("Rajesh");
        //Go to LastName text field and type value of sendKeys
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        // Go to Email text field and type the value of sendKeys
        driver.findElement(By.id("Email")).sendKeys("test"+timeStamp+"@gmail.com");
        // Go to Email Password field and type the value of sendKeys
        driver.findElement(By.id("Password")).sendKeys("test1234");
        // Go to Email ConfirmPassword field and type the value of sendKeys
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test1234");
        // click on register button
        driver.findElement(By.id("register-button")).click();
        //returns text of the element and store value in  regMsg variable
        String regMsg = driver.findElement(By.className("result")).getText();
        //printing the value of redMsg
        System.out.println(regMsg);

        // closing the opened url window
        driver.quit();
    }
}
