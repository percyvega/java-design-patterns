package com.percyvega.design_patterns._03_behavioral._11_visitor;

/**
 * Created by Percy on 1/11/2015.
 */
public interface CountryElement {

    void accept(WorldVisitor worldVisitor);

}
