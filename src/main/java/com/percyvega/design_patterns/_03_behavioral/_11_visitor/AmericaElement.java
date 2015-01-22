package com.percyvega.design_patterns._03_behavioral._11_visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
