package org.frangoro.headfirst.commandpattern.invoker;

import org.frangoro.headfirst.commandpattern.command.Command;
import org.frangoro.headfirst.commandpattern.command.FunctionalCommand;

/**
 * Every slot of org.frangoro.headfirst.commandpattern.invoker.SimpleRemoteControl bounds a org.frangoro.headfirst.commandpattern.command.Command.
 */
public class SimpleRemoteControlLambda {

    FunctionalCommand slot;

    public SimpleRemoteControlLambda() {
    }

    public void setCommand(FunctionalCommand command) {
        slot = command;
    }

    public void buttonWasPressed () {
        slot.execute();
    }


}
