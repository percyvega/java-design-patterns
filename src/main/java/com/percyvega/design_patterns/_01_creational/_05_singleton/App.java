package com.percyvega.design_patterns._01_creational._05_singleton;

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

        // There are at least thee ways of implementing Singleton.

        // One good way is using ENUMs
        EarthBestSingleton earth01 = EarthBestSingleton.INSTANCE;
        EarthBestSingleton earth02 = EarthBestSingleton.getInstance();
        logger.debug("Do earth01 and earth02 make reference to the same object?: " + (earth01 == earth02));

        // A second good way is using an uninstantiatable class implicitly lazy-initialized property
        EarthExcellentSingleton earth03 = EarthExcellentSingleton.getInstance();
        EarthExcellentSingleton earth04 = EarthExcellentSingleton.getInstance();
        logger.debug("Do earth03 and earth04 make reference to the same object?: " + (earth03 == earth04));

        // The classic way
        EarthClassicSingleton earth05 = EarthClassicSingleton.getInstance();
        EarthClassicSingleton earth06 = EarthClassicSingleton.getInstance();
        logger.debug("Do earth05 and earth06 make reference to the same object?: " + (earth05 == earth06));

        logger.debug("Finishing main()");
    }

}
