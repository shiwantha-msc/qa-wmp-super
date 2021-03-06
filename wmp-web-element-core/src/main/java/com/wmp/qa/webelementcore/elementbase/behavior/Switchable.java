package com.wmp.qa.webelementcore.elementbase.behavior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Switchable.java -  Interface type windows switch action related class
 *
 * @author Shiwantha Lakmal
 * @version 1.0-SNAPSHOT Last modified
 * @since
 */
public class Switchable {
    public void switchHere(RemoteWebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        driver.switchTo().frame(element);
    }
}
