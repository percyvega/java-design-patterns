package com.percyvega.design_patterns._02_structural._03_composite;

public abstract class SoundLeaf extends PlayableComponent {

    public SoundLeaf(String name) {
        super(name);
    }

    @Override
    public void play() {
        super.play();
    }

}
