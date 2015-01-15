package com.percyvega.design_patterns._03_behavioral._11_visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/12/2015.
 */
public class PeruvianVisitor implements WorldVisitor {

    private final static Logger logger = LoggerFactory.getLogger(PeruvianVisitor.class);

    private int countVisits = 0;

    @Override
    public void visit(ItalyElement italyElement) {
        countVisits++;
        if (countVisits < 2) {
            logger.debug("Peruvian presenting Password to enter Italy.");
        } else {
            throw new IllegalStateException("Too tired to visit the many beautiful places in Italy.");
        }
    }

    @Override
    public void visit(PeruElement peruElement) {
        countVisits++;
        logger.debug("Peruvian presenting ID to enter Peru.");
    }

    @Override
    public void visit(AmericaElement americaElement) {
        countVisits++;
        logger.debug("Peruvian presenting Password and Visa to enter America.");
    }
}
