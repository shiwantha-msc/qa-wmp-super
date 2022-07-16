package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseLabel;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Label extends BaseLabel {

    public Label(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
