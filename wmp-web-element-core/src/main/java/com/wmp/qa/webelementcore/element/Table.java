package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseTable;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Table extends BaseTable {

    public Table(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
