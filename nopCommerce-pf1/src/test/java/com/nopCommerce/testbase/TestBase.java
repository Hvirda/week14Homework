package com.nopCommerce.testbase;

import com.nopCommerce.propertyreader.PropertyReader;
import com.nopCommerce.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod (alwaysRun=true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
