package com.percyvega.design_patterns._03_behavioral._03_interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Copyright 2015 Percy Vega
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        Context context = new Context("2 5 6 1 8");

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
