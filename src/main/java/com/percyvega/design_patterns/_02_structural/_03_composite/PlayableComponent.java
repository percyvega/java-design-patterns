package com.percyvega.design_patterns._02_structural._03_composite;

public abstract class PlayableComponent {

    private String indentation = "";

    private String name;

    public PlayableComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(indentation + getName());
    }

    public String getIndentation() {
        return indentation;
    }

    public void setIndentation(String indentation) {
        this.indentation = indentation;
    }

    public void add(PlayableComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(PlayableComponent component) {
        throw new UnsupportedOperationException();
    }

}
