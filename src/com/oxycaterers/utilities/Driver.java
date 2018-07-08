package com.oxycaterers.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Driver
{
    private static WebDriver myDriver;

    private static  long timeout=10;
    public enum DriverTypes
    {
     INTERNETEXPLORER,FIREFOX,CHROME

    }

    public static WebDriver getDriver(DriverTypes d)
    {
        if(myDriver==null)
        {
            switch(d)
            {
                case INTERNETEXPLORER:
                    System.setProperty("webdriver.ie.driver","D:\\Vaibhav\\D Drive\\Vaibhav Testing\\Selenium Programme\\OxcyCaterers\\Drivers\\chromedriver.exe");
                    myDriver =new InternetExplorerDriver();
                    break;

                case CHROME:
                    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
                    myDriver =new ChromeDriver();
                    break;

              /*  case FIREFOX:
                    System.setProperty("webdriver.gecko.driver","Drivers/geckoDriver");
                    myDriver =new fireFoxDriver();
                    break;
            */}

            myDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            myDriver.manage().window().maximize();
        }

        return myDriver;
    }


}