package com.percyvega.design_patterns._02_structural._02_bridge.solution;

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
public class LinuxOS extends OS {

    private final static Logger logger = LoggerFactory.getLogger(LinuxOS.class);

    public LinuxOS(LT lt) {
        super(lt);
    }

    @Override
    public void restart() {
        logger.debug("Calling Linux process to restart...");
        lt.restart();
    }

    @Override
    public void shutDown() {
        logger.debug("Calling Linux process to shut down...");
        lt.shutDown();
    }
}
