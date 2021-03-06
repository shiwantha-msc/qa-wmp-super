package com.wmp.qa.webelementcore.elementbase.behavior;

import com.wmp.qa.utils.exception.ApplicationException;
import com.wmp.qa.utils.exception.ScriptException;
import com.wmp.qa.webelementcore.util.Constant;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.*;
/**
 * Tickable.java -  Interface type of  tic and check action related class
 *
 * @author Shiwantha Lakmal
 * @version 1.0-SNAPSHOT Last modified
 * @since
 */
public class Tickable {

    /**
     * Generic tic and check action
     *
     * @param driver
     * @param locator
     * @throws ApplicationException
     * @throws ScriptException
     */
    public void check(RemoteWebDriver driver, By locator) throws ApplicationException, ScriptException {
        try {
            WebElement element = (new WebDriverWait(driver, ofSeconds(Constant.TIMEOUT_IMPLICIT / 1000))).until(ExpectedConditions.elementToBeClickable(locator));
            if (!element.isSelected()) {
                element.click();
            }
        } catch (TimeoutException e) {
            throw new ApplicationException("Time out after waiting for element");
        } catch (InvalidElementStateException e) {
            throw new ApplicationException("Element Not editable");
        } catch (StaleElementReferenceException e) {
            throw new ScriptException("Element No longer attached to page DOM");
        }
    }

    /**
     * Generic un-tic and un-check action
     *
     * @param driver
     * @param locator
     * @throws ApplicationException
     * @throws ScriptException
     */
    public void unCheck(RemoteWebDriver driver, By locator) throws ApplicationException, ScriptException {
        try {
            WebElement element = (new WebDriverWait(driver, ofSeconds(Constant.TIMEOUT_IMPLICIT / 1000))).until(ExpectedConditions.elementToBeClickable(locator));
            if (element.isSelected()) {
                element.click();
            }
        } catch (TimeoutException e) {
            throw new ApplicationException("Time out after waiting for element");
        } catch (InvalidElementStateException e) {
            throw new ApplicationException("Element Not editable");
        } catch (StaleElementReferenceException e) {
            throw new ScriptException("Element No longer attached to page DOM");
        }
    }

    /**
     * Verify the particular element is checked
     *
     * @param driver
     * @param locator
     * @return boolean
     * @throws ApplicationException
     * @throws ScriptException
     */
    public boolean verifyChecked(RemoteWebDriver driver, By locator) throws ApplicationException, ScriptException {
        try {
            WebElement element = (new WebDriverWait(driver, ofSeconds(Constant.TIMEOUT_IMPLICIT / 1000))).until(ExpectedConditions.elementToBeClickable(locator));
            return element.isSelected();
        } catch (TimeoutException e) {
            throw new ApplicationException("Time out after waiting for element");
        } catch (InvalidElementStateException e) {
            throw new ApplicationException("Element Not editable");
        } catch (StaleElementReferenceException e) {
            throw new ScriptException("Element No longer attached to page DOM");
        }
    }

    /**
     * Verify the particular element is un-checked
     *
     * @param driver
     * @param locator
     * @return boolean
     * @throws ApplicationException
     * @throws ScriptException
     */
    public boolean verifyUnchecked(RemoteWebDriver driver, By locator) throws ApplicationException, ScriptException {
        try {
            WebElement element = (new WebDriverWait(driver, ofSeconds(Constant.TIMEOUT_IMPLICIT / 1000))).until(ExpectedConditions.elementToBeClickable(locator));
            return !element.isSelected();
        } catch (TimeoutException e) {
            throw new ApplicationException("Time out after waiting for element");
        } catch (InvalidElementStateException e) {
            throw new ApplicationException("Element Not editable");
        } catch (StaleElementReferenceException e) {
            throw new ScriptException("Element No longer attached to page DOM");
        }
    }
}
