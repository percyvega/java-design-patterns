package com.percyvega.design_patterns._02_structural._02_bridge.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/4/2015.
 */
public class LinuxOSDellLT extends LinuxOS implements DellLT {

    private final static Logger logger = LoggerFactory.getLogger(LinuxOSDellLT.class);

    @Override
    public void restart() {
        logger.debug("Calling Linux process to restart...");
        logger.debug("Using Dell machine instructions to restart...");
    }

    @Override
    public void shutDown() {
        logger.debug("Calling Linux process to shut down...");
        logger.debug("Using Dell machine instructions to shut down...");
    }

}
