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
 * Clickable.java -  Interface type of click action related class
 *
 * @author Shiwantha Lakmal
 * @version 1.0-SNAPSHOT Last modified
 * @since
 */
public class Clickable {

    public void click(RemoteWebDriver driver, By locator) throws ApplicationException, ScriptException {
        try {
            WebElement element;
            element = (new WebDriverWait(driver, ofSeconds(Constant.TIMEOUT_IMPLICIT / 1000))).until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
        } catch (InvalidElementStateException e) {
            throw new ApplicationException("Element Not editable");
        } catch (StaleElementReferenceException e) {
            throw new ScriptException("Element No longer attached to page DOM");
        } catch (WebDriverException e){
            throw new ScriptException("Element is not clickable at current point");
        }
    }
}
