package org.example; // org.example is the package to store the java classes

import org.openqa.selenium.By;  // importing a package of selenium
import org.openqa.selenium.WebDriver;  // importing a package of selenium WebDriver
import org.openqa.selenium.chrome.ChromeDriver; // importing a package of chromeDriver

public class EmailAFriend {

    protected static WebDriver driver;
    //imported selenium web driver interface using Maven dependency to perform automation task

    // main method of this class
    public static void main(String[] args) {

        //Set the path of the driver for the chrome Browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");

        //creating object with chromedriver
        driver = new ChromeDriver();

        // To maximize a browser window
        driver.manage().window().maximize();
        //set application URL to navigate
        driver.get("https://demo.nopcommerce.com/");

        // click on Apple MacBook Pro 13-inch
        driver.findElement(By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]")).click();

        //click on email a friend button
        driver.findElement(By.className("email-a-friend")).click();

        //Go to FriendEmail text field and type value of sendKeys
        driver.findElement(By.id("FriendEmail")).sendKeys("Test123@gmail.com");
        //Go to YourEmailAddress text field and type value of sendKeys
        driver.findElement(By.id("YourEmailAddress")).sendKeys("abc123@gmail.com");
        //Go to PersonalMessage text field and type value of sendKeys
        driver.findElement(By.id("PersonalMessage")).sendKeys("Hope you like a product");
        // click on send email button
        driver.findElement(By.className("buttons")).click();

        //returns text of the element and store value in msg variable
        String msg =driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();
        //printing value of msg
        System.out.println(msg);

        // closing the opened url window
        driver.quit();



    }
}
