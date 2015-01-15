package com.percyvega.design_patterns._03_behavioral._03_interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        String digits = new String("2 5 6 1 8");
        Context context = new Context(digits);

        ArrayList<Expression> expressions = new ArrayList<>();
        expressions.add(new SpanishExpression());
        expressions.add(new EnglishExpression());

        for (Expression expression : expressions) {
            expression.interpret(context);
            logger.debug("Interpreted using " + expression.getClass().getSimpleName() + ": " + context.getOutput());
        }

        logger.debug("Finishing main()");

    }

}
