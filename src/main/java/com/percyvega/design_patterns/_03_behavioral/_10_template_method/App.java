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
public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        System.out.println();

        UniversityClass onSiteClass = new OnSiteClass();
        onSiteClass.attend();

        System.out.println();

        UniversityClass liveOnlineClass = new LiveOnlineClass();
        liveOnlineClass.attend();

        System.out.println();

        UniversityClass prerecordedOnlineClass = new PrerecordedOnlineClass();
        prerecordedOnlineClass.attend();

        System.out.println();

        logger.debug("Finishing main()");

    }

}
