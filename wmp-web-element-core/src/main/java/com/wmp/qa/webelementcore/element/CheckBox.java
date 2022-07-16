package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseCheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CheckBox extends BaseCheckBox {

    public CheckBox(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
