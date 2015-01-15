package com.percyvega.design_patterns._03_behavioral._04_iterator;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Percy on 1/7/2015.
 */
public class FavoritesToShare<T> extends Favorites<T> {

    private Set<T> favorites;
    private MyIterator<T> iterator;

    public FavoritesToShare() {
        this.favorites = new HashSet<>();
    }

    @Override
    public void add(T aFavorite) {
        this.favorites.add(aFavorite);
    }

    @Override
    public MyIterator<T> getIterator() {
        iterator = new FavoritesToShareIterator<>();
        return iterator;
    }

    private class FavoritesToShareIterator<T> implements MyIterator<T> {

        T[] array;
        int i;

        public FavoritesToShareIterator() {
            array = (T[]) favorites.toArray();
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
