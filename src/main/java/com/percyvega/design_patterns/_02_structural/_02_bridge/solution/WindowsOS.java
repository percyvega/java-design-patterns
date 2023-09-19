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
public class WindowsOS extends OS {

    private final static Logger logger = LoggerFactory.getLogger(WindowsOS.class);

    public WindowsOS(Laptop laptop) {
        super(laptop);
    }

    @Override
    public void restart() {
        logger.debug("Calling Windows DLLs to restart...");
        laptop.restart();
    }

    @Override
    public void shutDown() {
        logger.debug("Calling Windows DLLs to shut down...");
        laptop.shutDown();
    }
}
