package com.percyvega.design_patterns._03_behavioral._04_iterator;

/**
 * Created by Percy on 1/7/2015.
 */
public abstract class Favorites<T> {

    public abstract void add(T aFavorite);

    public abstract MyIterator<T> getIterator();

}

