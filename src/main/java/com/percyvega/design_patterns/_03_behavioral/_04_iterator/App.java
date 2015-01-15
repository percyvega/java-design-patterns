package com.percyvega.design_patterns._03_behavioral._04_iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
