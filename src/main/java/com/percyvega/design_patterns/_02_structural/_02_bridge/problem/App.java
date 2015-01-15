package com.percyvega.design_patterns._02_structural._02_bridge.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        OS system1 = new LinuxOSDellLT();
        OS system2 = new LinuxOSLenovoLT();
        OS system3 = new WindowsOSDellLT();
        OS system4 = new WindowsOSLenovoLT();

        system1.restart();
        system1.shutDown();
        System.out.println();
        system2.restart();
        system2.shutDown();
        System.out.println();
        system3.restart();
        system3.shutDown();
        System.out.println();
        system4.restart();
        system4.shutDown();

        logger.debug("Finishing main()");

    }

}
