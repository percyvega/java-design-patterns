package com.percyvega.design_patterns._02_structural._03_composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        PlayableComponent playlist1 = new PlaylistComposite("Listen While Driving");
        PlayableComponent playlist2 = new PlaylistComposite("My Favorites");
        PlayableComponent song3 = new SongLeaf("Celine Dion - All By Myself");
        PlayableComponent song1 = new SongLeaf("Luis Miguel - La Barca");
        PlayableComponent song2 = new SongLeaf("Luis Miguel - La Puerta");
        PlayableComponent podcast1 = new PodcastLeaf("John MacArthur - Intro to Strange Fire");

        playlist1.add(playlist2);
        playlist1.add(song3);
        playlist2.add(song1);
        playlist2.add(song2);
        playlist2.add(podcast1);

        playlist1.play();

        logger.debug("Finishing main()");

    }

}
