package com.percyvega.design_patterns._02_structural._05_facade;

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
public class MealFacadeImpl implements MealFacade {

    private Dish starter;
    private Dish mainDish;
    private Dish dessert;

    public MealFacadeImpl(Dish starter, Dish mainDish, Dish dessert) {
        this.starter = starter;
        this.mainDish = mainDish;
        this.dessert = dessert;
    }

    public MealFacadeImpl(Dish dish01, Dish dish02) {
        identifyAndInitialize(dish01);
        identifyAndInitialize(dish02);
    }

    public MealFacadeImpl(Dish dish) {
        identifyAndInitialize(dish);
    }

    private void identifyAndInitialize(Dish dish) {
        if (dish instanceof Starter)
            this.starter = dish;
        else if (dish instanceof MainDish)
            this.mainDish = dish;
        else if (dish instanceof Dessert)
            this.dessert = dish;
    }

    @Override
    public void serve() {
        if (starter != null) {
            starter.mixIngredients();
            starter.putInSmallDishware();
            starter.serve();
        }
        if (mainDish != null) {
            mainDish.addProteins();
            mainDish.addCarbs();
            mainDish.putInBigDishware();
            mainDish.serve();
        }
        if (dessert != null) {
            dessert.addSweetIngredients();
            dessert.putInGlassDishware();
            dessert.serve();
        }
    }
}
