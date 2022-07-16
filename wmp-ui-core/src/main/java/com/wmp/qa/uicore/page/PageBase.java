package com.wmp.qa.uicore.page;

import com.wmp.qa.utils.util.FrameworkProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/**
 * PageBase.java - Common methods implementation for page base
 *
 * @author ShiwanthaK
 * @version 1.0-SNAPSHOT Last modified
 * @since
 */
public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void initializeElements(BasicPage sourcePage){
        FrameworkProperties loadProperties = new FrameworkProperties();
        LinkedHashMap<String, LinkedHashMap<String, String>> loadDataFromXml = new LinkedHashMap<String, LinkedHashMap<String, String>>();
        String strDefault = "";
        String strFindBy = "";
        String strValue = "";

        for (Field field : sourcePage.getClass().getDeclaredFields()) {
            String name = field.getName();
            System.out.println(name);
            System.out.println(sourcePage.getClass().getPackage().getName().toString());
            System.out.println(sourcePage.getClass().getSimpleName());
        }
    }
}
