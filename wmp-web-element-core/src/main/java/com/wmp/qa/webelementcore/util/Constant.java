package com.wmp.qa.webelementcore.util;

import com.wmp.qa.utils.exception.FrameworkException;
import com.wmp.qa.utils.util.FrameworkProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.HashMap;


public class Constant {
    private static final Logger LOGGER = LoggerFactory.getLogger(Constant.class);

    private static final String TIMEOUT_IMPLICIT_KEY = "implicit";

    public static int TIMEOUT_IMPLICIT;
    public static String MOBILE_MODE;

    private static HashMap <String,String> hmLoadDataFromXml;
    private static String strLoggerMsg;
    private static String strClassName;

    static {

        try {
            loadXmlProperties();
        } catch (FrameworkException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loading xml values to global variables.
     */

    public static void loadXmlProperties() throws FrameworkException {
        FrameworkProperties loadProperties = new FrameworkProperties();
        hmLoadDataFromXml = new HashMap<String, String>();
        URL inputStream = null;
        inputStream = Constant.class.getClassLoader().getResource("config/ui/environment.xml");
        hmLoadDataFromXml = loadProperties.readProjEnvConfig(inputStream.getPath());


        try {
            TIMEOUT_IMPLICIT = Integer.parseInt(System.getProperty(TIMEOUT_IMPLICIT_KEY) != null ? System.getProperty(TIMEOUT_IMPLICIT_KEY) : hmLoadDataFromXml.get(TIMEOUT_IMPLICIT_KEY));
        } catch (Exception e) {
            strClassName = Constant.class.getSimpleName();
            throw new FrameworkException("Configuration not found error on Class:" + strClassName + " line #:" + Thread.currentThread().getStackTrace()[1].getLineNumber(), e);
        }
    }
}

