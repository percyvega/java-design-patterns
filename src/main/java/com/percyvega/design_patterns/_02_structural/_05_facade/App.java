package com.percyvega.design_patterns._02_structural._05_facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;

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

    public static void main(String[] args) throws ParseException {
        logger.debug("Starting main()");

        logger.debug("--------------------------------------------------------------");
        logger.debug("Starting to prepare a three course meal WITHOUT facade.");
        Dish starter = new Starter();
        starter.mixIngredients();
        starter.putInSmallDishware();
        starter.serve();

        Dish mainDish = new MainDish();
        mainDish.addProteins();
        mainDish.addCarbs();
        mainDish.putInBigDishware();
        mainDish.serve();

        Dish dessert = new Dessert();
        dessert.addSweetIngredients();
        dessert.putInGlassDishware();
        dessert.serve();
        logger.debug("Three course meal has been served WITHOUT facade.");
        logger.debug("--------------------------------------------------------------");

        System.out.println();

        logger.debug("--------------------------------------------------------------");
        logger.debug("Starting to prepare a three course meal WITH facade.");
        MealFacadeImpl meal01 = new MealFacadeImpl(new Starter(), new MainDish(), new Dessert());
        meal01.serve();
        logger.debug("Three course meal has been served WITH facade.");
        logger.debug("--------------------------------------------------------------");

        System.out.println();

        logger.debug("--------------------------------------------------------------");
        logger.debug("Starting to prepare a two course meal WITH facade.");
        MealFacadeImpl meal02 = new MealFacadeImpl(new MainDish(), new Dessert());
        meal02.serve();
        logger.debug("Two course meal has been served WITH facade.");
        logger.debug("--------------------------------------------------------------");

        logger.debug("Finishing main()");
    }

}
