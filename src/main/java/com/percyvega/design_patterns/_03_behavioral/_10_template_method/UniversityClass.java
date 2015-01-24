package com.percyvega.design_patterns._03_behavioral._10_template_method;

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
public abstract class UniversityClass {

    private final static Logger logger = LoggerFactory.getLogger(UniversityClass.class);

    public final void attend() {
        logger.debug("Starting " + this.getClass().getSimpleName() + " session.");

        getReadyForClass();
        watchListenInstructor();
        askQuestions();
        leaveClass();

        logger.debug("Finishing " + this.getClass().getSimpleName() + " session.");
    }

    protected abstract void getReadyForClass();

    protected final void watchListenInstructor() {
        logger.debug("Paying careful attention to instructor and taking notes.");
    }

    protected void askQuestions() {
        logger.debug("Raising hand and asking questions.");
    }

    protected abstract void leaveClass();
}
