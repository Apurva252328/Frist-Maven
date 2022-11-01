package org.example;// org.example is the package to store the java classes

import org.openqa.selenium.By; // importing a package of selenium
import org.openqa.selenium.WebDriver; // importing a package of selenium WebDriver
import org.openqa.selenium.chrome.ChromeDriver; // importing a package of chromeDriver

public class NewsComments {
    protected static WebDriver driver;
    //imported selenium web driver interface using Maven dependency to perform automation task

    // main method of this class
    public static void main(String[] args) {
        //Set the path of the driver for the chrome Browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        //creating object with chromedriver
        driver = new ChromeDriver();

        // To maximize a browser window
        driver.manage().window().maximize();

        //set application URL to navigate
        driver.get("https://demo.nopcommerce.com/");
        //click on details button
        driver.findElement(By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a")).click();
        //Go to Title text field and type value of sendKeys
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Laptop");
        //Go to Comment text field and type value of sendKeys
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("I am very happy to use this product");
        // click on button
        driver.findElement(By.className("buttons")).click();

        //returns text of the element and store value in  regMsg variable
        String regMsg = driver.findElement(By.className("result")).getText();
        //printing value of regMsg
        System.out.println(regMsg);

        // closing the opened url window
        driver.quit();
    }
}
