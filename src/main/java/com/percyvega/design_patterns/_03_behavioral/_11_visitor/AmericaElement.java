package com.percyvega.design_patterns._03_behavioral._11_visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/11/2015.
 */
public class AmericaElement implements CountryElement {

    private final static Logger logger = LoggerFactory.getLogger(AmericaElement.class);

    public static final int MAX_NUMBER_SIMULTANEOUS_VISITORS = 1;

    private int currentVisitors = 0;

    @Override
    public void accept(WorldVisitor worldVisitor) {
        worldVisitor.visit(this);
        if (++currentVisitors > MAX_NUMBER_SIMULTANEOUS_VISITORS)
            logger.debug("Rejected. Maximum number of visitors was reached.");
        else
            logger.debug("Accepted. Welcome to the United States of America.");
    }
}
