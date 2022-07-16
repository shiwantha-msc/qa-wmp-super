package com.wmp.qa.uicore.test;

import com.wmp.qa.uicore.driver.DriverConnection;
import com.wmp.qa.utils.exception.FrameworkException;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * TestBase.java - Suite initializer and terminator class
 *
 * @author Shiwantha Lakmal
 * @version 1.0-SNAPSHOT Last modified
 * @since
 */
public class TestBase {
    final static Logger log = Logger.getLogger(TestBase.class);
    private RemoteWebDriver driver;

    public RemoteWebDriver getDriver() {
        return driver;
    }

    @BeforeMethod(alwaysRun = true)
    public void initializeBaseSetup() throws FrameworkException {
        driver = DriverConnection.getDeriverInstance();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws FrameworkException {
        DriverConnection.closeDriver();
    }
}
