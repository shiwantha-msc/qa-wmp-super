package com.wmp.qa.webelementcore.element;

import com.wmp.qa.webelementcore.elementbase.core.BaseFileBrowse;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FileBrowse extends BaseFileBrowse {

    public FileBrowse(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
