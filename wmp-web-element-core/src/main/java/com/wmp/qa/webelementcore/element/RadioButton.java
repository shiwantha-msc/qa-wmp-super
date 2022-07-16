package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseRadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RadioButton extends BaseRadioButton {

    public RadioButton(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
