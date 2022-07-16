package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseHeader;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Header extends BaseHeader {

    public Header(RemoteWebDriver driver, By locator) {
        super(driver, locator);
    }

}
