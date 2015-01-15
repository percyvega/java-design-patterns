package com.percyvega.design_patterns._02_structural._03_composite;

import java.util.ArrayList;
import java.util.List;

public class PlaylistComposite extends PlayableComponent {

    private List<PlayableComponent> components;

    public PlaylistComposite(String name) {
        super("Playlist: " + name);
        components = new ArrayList<>();
    }

    @Override
    public void play() {
        super.play();
        for (PlayableComponent playableComponent : components) {
            playableComponent.play();
        }
    }

    @Override
    public void add(PlayableComponent component) {
        component.setIndentation(getIndentation() + "    ");
        components.add(component);
    }

    @Override
    public void remove(PlayableComponent component) {
        components.remove(component);
    }

}
