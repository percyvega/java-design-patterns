package com.percyvega.design_patterns._03_behavioral._11_visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/11/2015.
 */
public class PeruElement implements CountryElement {

    private final static Logger logger = LoggerFactory.getLogger(PeruElement.class);

    @Override
    public void accept(WorldVisitor worldVisitor) {
        worldVisitor.visit(this);
        logger.debug("Accepted. Welcome to Peru.");
    }
}
