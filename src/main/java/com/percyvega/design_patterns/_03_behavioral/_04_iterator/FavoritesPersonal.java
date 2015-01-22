package com.percyvega.design_patterns._03_behavioral._04_iterator;

import java.util.HashMap;
import java.util.Map;

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
