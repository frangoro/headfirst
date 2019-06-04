package org.frangoro.headfirst.commandpattern.command;

public interface Command {
    public void execute();
    public void undo();
}
