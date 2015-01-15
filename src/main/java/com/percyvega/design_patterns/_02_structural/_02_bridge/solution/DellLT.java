package com.percyvega.design_patterns._02_structural._02_bridge.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/4/2015.
 */
public class DellLT implements LT {

    private final static Logger logger = LoggerFactory.getLogger(DellLT.class);

    @Override
    public void restart() {
        logger.debug("Using Dell machine instructions to restart...");
    }

    @Override
    public void shutDown() {
        logger.debug("Using Dell machine instructions to shut down...");
    }
}
