package com.wmp.qa.utils.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DataMissingException.java
 * <p/>
 * Handle data related exceptions
 *
 * @author Shiwantha Lakmal
 * @version 1.0-SNAPSHOT Last modified
 * @since
 */
public class DataMissingException extends FrameworkException {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataMissingException.class);

    /**
     * Constructor passing message only
     *
     * @param message error message
     */
    public DataMissingException(String message) {
        super(message);
        LOGGER.error(message);
    }

    /**
     * Constructor passing message and exception object
     *
     * @param message error message
     * @param e exception object
     */
    public DataMissingException(String message, Exception e) {
        super(message, e);
        LOGGER.error(message, e);
    }

}

