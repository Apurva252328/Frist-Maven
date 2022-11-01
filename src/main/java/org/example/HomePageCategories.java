package org.example; // org.example is the package to store the java classes

import org.openqa.selenium.By; // importing a package of selenium
import org.openqa.selenium.WebDriver;  // importing a package of selenium WebDriver
import org.openqa.selenium.chrome.ChromeDriver; // importing a package of chromeDriver
public class HomePageCategories {

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

        //returns text of the element and store value in  Category1 variable
     String Category1 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li//a[@href=\"/computers\"]")).getText();

        //returns text of the element and store value in  Category2 variable
        String Category2 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li//a[@href=\"/electronics\"]")).getText();

        //returns text of the element and store value in  Category3 variable
        String Category3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li//a[@href=\"/apparel\"]")).getText();

        //returns text of the element and store value in  Category4 variable
        String Category4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li//a[@href=\"/digital-downloads\"]")).getText();

        //returns text of the element and store value in  Category5 variable
        String Category5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li//a[@href=\"/books\"]")).getText();

        //returns text of the element and store value in  Category6 variable
        String Category6 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li//a[@href=\"/jewelry\"]")).getText();

        //returns text of the element and store value in  Category7 variable
        String Category7 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li//a[@href=\"/gift-cards\"]")).getText();

        //printing value of Category1
        System.out.println(Category1);

        //printing value of Category2
        System.out.println(Category2);

        //printing value of Category3
        System.out.println(Category3);

        //printing value of Category4
        System.out.println(Category4);

        //printing value of Category5
        System.out.println(Category5);

        //printing value of Category6
        System.out.println(Category6);

        //printing value of Category7
        System.out.println(Category7);

        // closing the opened url window
        driver.quit();
    }
}