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
