package com.percyvega.design_patterns._03_behavioral._11_visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        CountryElement americaElement = new AmericaElement();
        CountryElement italyElement = new ItalyElement();

        WorldVisitor peruvianVisitor = new PeruvianVisitor();
        WorldVisitor italianVisitor = new ItalianVisitor();

        americaElement.accept(peruvianVisitor);
        americaElement.accept(italianVisitor);

        italyElement.accept(peruvianVisitor);

        logger.debug("Finishing main()");

    }

}
