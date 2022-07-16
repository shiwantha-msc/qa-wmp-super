package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseIFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IFrame extends BaseIFrame {

    public IFrame(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
