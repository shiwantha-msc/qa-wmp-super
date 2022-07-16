package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseUnorderedList;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UnorderedList extends BaseUnorderedList {

    public UnorderedList(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
