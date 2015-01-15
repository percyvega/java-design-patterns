package com.percyvega.design_patterns._02_structural._02_bridge.solution;

/**
 * Created by Percy on 12/20/2014.
 */
public abstract class OS {

    LT lt;

    public OS(LT lt) {
        this.lt = lt;
    }

    public abstract void restart();

    public abstract void shutDown();

}
