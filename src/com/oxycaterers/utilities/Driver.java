package com.oxycaterers.utilities;

import java.util.concurrent.TimeUnit;

public class Driver
{
    private static WebDriver MyDriver;

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

                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver","Drivers/geckoDriver");
                    myDriver =new FireFoxDriver();
                    break;
            }

            myDriver.manage().timesouts().implycitlyWait(20, TimeUnit.SECONDS);
            myDriver.manage().window().maximize();
        }
    }


}