package org.frangoro.headfirst.commandpattern.invoker;

import org.frangoro.headfirst.commandpattern.command.Command;

/**
 * Every slot of org.frangoro.headfirst.commandpattern.invoker.SimpleRemoteControl bounds a org.frangoro.headfirst.commandpattern.command.Command.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl () {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed () {
        slot.execute();
    }


}
