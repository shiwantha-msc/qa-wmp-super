package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseMagicElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;

public class MagicElement extends BaseMagicElement {

    public MagicElement(RemoteWebDriver driver, By locator) throws AWTException {
        super(driver, locator);

    }

}
