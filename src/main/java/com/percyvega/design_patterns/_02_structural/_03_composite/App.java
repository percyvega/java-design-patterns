package com.percyvega.design_patterns._02_structural._03_composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
