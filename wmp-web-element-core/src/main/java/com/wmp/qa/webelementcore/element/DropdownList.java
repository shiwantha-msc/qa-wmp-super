package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseDropdownList;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DropdownList extends BaseDropdownList {

    public DropdownList(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
