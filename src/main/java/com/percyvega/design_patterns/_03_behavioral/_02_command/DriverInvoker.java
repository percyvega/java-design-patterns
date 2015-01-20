package com.percyvega.design_patterns._03_behavioral._02_command;

/**
 * Created by Percy on 1/20/2015.
 */
public class DriverInvoker {

    public void executeCommand(Command command) {
        // log/audit this command
        // allow/validate this command
        // delay the execution of this command (e.g. execute only every 30 minutes)
        command.execute();
    }

    public void undoCommand(Command command) {
        command.undo();
    }

}
