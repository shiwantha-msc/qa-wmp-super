package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseButton;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author maheshd
 */
public class Button extends BaseButton {

    public Button(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }


}
