package com.percyvega.design_patterns._03_behavioral._11_visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;

public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        CountryElement americaElement = new AmericaElement();
        CountryElement italyElement = new ItalyElement();

        Collection<WorldVisitor> worldVisitors = new ArrayList<>();
        worldVisitors.add(new PeruvianVisitor());
        worldVisitors.add(new ItalianVisitor());

        for (WorldVisitor worldVisitor : worldVisitors) {
            americaElement.accept(worldVisitor);
            System.out.println();
            italyElement.accept(worldVisitor);
        }

        logger.debug("Finishing main()");

    }

}
