package com.percyvega.design_patterns._02_structural._02_bridge.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/4/2015.
 */
public class WindowsOS extends OS {

    private final static Logger logger = LoggerFactory.getLogger(WindowsOS.class);

    public WindowsOS(LT lt) {
        super(lt);
    }

    @Override
    public void restart() {
        logger.debug("Calling Windows DLLs to restart...");
        lt.restart();
    }

    @Override
    public void shutDown() {
        logger.debug("Calling Windows DLLs to shut down...");
        lt.shutDown();
    }
}
