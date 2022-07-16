package com.wmp.qa.uicore.driver;

/**
 * Browser.java -  Collection of web browsers enum class
 *
 * @author Shiwantha Lakmal
 * @version 1.0-SNAPSHOT Last modified
 * @since
 */
public enum Browser {
    FIREFOX("firefox"), CHROME("chrome"), SAFARI("safari"), EXPLORE("ie"), EDGE("edge");

    private String statusCode;

    private Browser(String s) {
        statusCode = s;
    }

    public String getStatusCode() {
        return statusCode;
    }
}
