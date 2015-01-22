package com.percyvega.design_patterns._03_behavioral._04_iterator;

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

        Favorites favoriteNames = new FavoritesToShare<String>();
        Favorites favoriteYears = new FavoritesPersonal<Integer>();

        favoriteNames.add("Ana");
        favoriteNames.add("John");
        favoriteNames.add("Maria");
        favoriteNames.add("Mark");

        favoriteYears.add(1918);
        favoriteYears.add(1948);
        favoriteYears.add(2000);

        MyIterator namesIterator = favoriteNames.getIterator();
        MyIterator yearsIterator = favoriteYears.getIterator();

        while (namesIterator.hasNext())
            logger.debug(namesIterator.next().toString());
        while (yearsIterator.hasNext())
            logger.debug(yearsIterator.next().toString());

        logger.debug("Finishing main()");

    }

}
