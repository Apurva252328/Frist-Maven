package org.example; // org.example is the package to store the java classes

import org.openqa.selenium.By; // importing a package of selenium
import org.openqa.selenium.WebDriver;  // importing a package of selenium WebDriver
import org.openqa.selenium.chrome.ChromeDriver; // importing a package of chromeDriver

public class Products {

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

       // click on computer element
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a")).click();

        // click on Desktop element
        driver.findElement(By.xpath("//img[@alt=\"Picture for category Desktops\"]")).click();

        //returns text of the element and store value in  regMsg variable
        String regMsg = driver.findElement(By.xpath("//div[@class=\"product-grid\"]/div/div/div/div[2]/h2/a[@href=\"/build-your-own-computer\"]")).getText();

        //returns text of the element and store value in  regMsg1 variable
        String redMsg1 =driver.findElement(By.xpath("//div[@class=\"product-grid\"]/div/div/div/div[2]/h2/a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();

        //returns text of the element and store value in  regMsg2 variable
        String redMsg2 =driver.findElement(By.xpath("//div[@class=\"product-grid\"]/div/div/div/div[2]/h2/a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();

        //printing value of regMsg
        System.out.println(regMsg);

        //printing value of regMsg1
        System.out.println(redMsg1);

        //printing value of regMsg2
        System.out.println(redMsg2);

        // closing the opened url window
       driver.quit();


    }
}
