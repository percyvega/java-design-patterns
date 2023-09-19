package com.percyvega.design_patterns._02_structural._02_bridge.problem;

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
public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        OS system1 = new LinuxOSDellLaptop();
        OS system2 = new LinuxOSLenovoLaptop();
        OS system3 = new WindowsOSDellLaptop();
        OS system4 = new WindowsOSLenovoLaptop();

        system1.restart();
        system1.shutDown();
        System.out.println();
        system2.restart();
        system2.shutDown();
        System.out.println();
        system3.restart();
        system3.shutDown();
        System.out.println();
        system4.restart();
        system4.shutDown();

        logger.debug("Finishing main()");

    }

}
