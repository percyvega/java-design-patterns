package com.percyvega.design_patterns._02_structural._03_composite;

import java.util.ArrayList;
import java.util.List;

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
