package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseImage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Image extends BaseImage {

    public Image(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
