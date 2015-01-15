package com.percyvega.design_patterns._02_structural._02_bridge.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/4/2015.
 */
public class LinuxOSLenovoLT extends LinuxOS implements LenovoLT {

    private final static Logger logger = LoggerFactory.getLogger(LinuxOSLenovoLT.class);

    @Override
    public void restart() {
        logger.debug("Calling Linux process to restart...");
        logger.debug("Using Lenovo machine instructions to restart...");
    }

    @Override
    public void shutDown() {
        logger.debug("Calling Linux process to shut down...");
        logger.debug("Using Lenovo machine instructions to shut down...");
    }

}
