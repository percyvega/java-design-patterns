package com.percyvega.design_patterns._03_behavioral._11_visitor;

/**
 * Created by Percy on 1/11/2015.
 */
public interface WorldVisitor {

    void visit(ItalyElement italyElement);
    void visit(PeruElement peruElement);
    void visit(AmericaElement americaElement);

}
