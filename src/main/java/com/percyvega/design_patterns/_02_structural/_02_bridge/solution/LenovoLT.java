package com.percyvega.design_patterns._02_structural._02_bridge.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/4/2015.
 */
public class LenovoLT implements LT {

    private final static Logger logger = LoggerFactory.getLogger(LenovoLT.class);

    @Override
    public void restart() {
        logger.debug("Using Lenovo machine instructions to restart...");
    }

    @Override
    public void shutDown() {
        logger.debug("Using Lenovo machine instructions to shut down...");
    }
}
