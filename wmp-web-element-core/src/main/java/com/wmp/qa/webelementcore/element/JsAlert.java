package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseJsAlert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JsAlert extends BaseJsAlert {

    public JsAlert(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
