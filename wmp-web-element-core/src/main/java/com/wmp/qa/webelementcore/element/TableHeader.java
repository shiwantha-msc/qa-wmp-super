package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseTableHeader;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;

public class TableHeader extends BaseTableHeader {

    public TableHeader(RemoteWebDriver driver, By locator) throws AWTException {
        super(driver, locator);

    }

}
