package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseTextElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;

public class TextElement extends BaseTextElement {

    public TextElement(RemoteWebDriver driver, By locator) throws AWTException {
        super(driver, locator);

    }

}
