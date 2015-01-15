package com.percyvega.design_patterns._03_behavioral._04_iterator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Percy on 1/7/2015.
 */
public class FavoritesPersonal<T> extends Favorites<T> {

    private Map<T, T> favorites;
    private MyIterator<T> iterator;

    public FavoritesPersonal() {
        this.favorites = new HashMap<>();
    }

    @Override
    public void add(T aFavorite) {
        this.favorites.put(aFavorite, aFavorite);
    }

    @Override
    public MyIterator<T> getIterator() {
        iterator = new FavoritesPersonalIterator<>();
        return iterator;
    }

    private class FavoritesPersonalIterator<T> implements MyIterator<T> {

        T[] array;
        int i;

        public FavoritesPersonalIterator() {
            array = (T[]) favorites.values().toArray();
            i = 0;
        }

        @Override
        public boolean hasNext() {
            return i < array.length;
        }

        @Override
        public T next() {
            T next = array[i];
            i++;
            return next;
        }
    }

}
