package com.percyvega.design_patterns._03_behavioral._11_visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/12/2015.
 */
public class ItalianVisitor implements WorldVisitor {

    private final static Logger logger = LoggerFactory.getLogger(ItalianVisitor.class);

    @Override
    public void visit(ItalyElement italyElement) {
        logger.debug("Italian presenting ID to enter Italy.");
    }

    @Override
    public void visit(PeruElement peruElement) {
        logger.debug("Italian presenting Passport to enter Peru.");
    }

    @Override
    public void visit(AmericaElement americaElement) {
        logger.debug("Italian presenting Password and Visa to enter America.");
    }
}
