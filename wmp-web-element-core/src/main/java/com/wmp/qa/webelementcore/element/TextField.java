package com.wmp.qa.webelementcore.element;

import com.wmp.qa.utils.exception.ApplicationException;
import com.wmp.qa.utils.exception.ScriptException;
import com.wmp.qa.webelementcore.elementbase.core.BaseTextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;

public class TextField extends BaseTextField {

    public TextField(RemoteWebDriver driver, By locator) throws AWTException {
        super(driver, locator);

    }


    public void enterTextAndSubmit(String text) throws ScriptException, ApplicationException {
        super.enterText(text);
        baseTextFieldElement = driver.findElement(locator);
        baseTextFieldElement.sendKeys(org.openqa.selenium.Keys.ENTER);
    }

    public void enterTextAndSubmitForcefully(String text) {
        WebElement element = driver.findElement(locator);
        element.click();
        keyBoard.clearTextField();
        keyBoard.typeText(text);
        keyBoard.type("\n");
    }
}
