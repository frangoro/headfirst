package org.frangoro.headfirst.commandpattern.invoker;

import org.frangoro.headfirst.commandpattern.command.Command;
import org.frangoro.headfirst.commandpattern.command.NoCommand;

public class RemoteControlWithUndo {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n--- Remote Control ---\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[Slot " + i + "] " + onCommands[i].getClass().getSimpleName() + " - " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        sb.append("[Undo] " + undoCommand.getClass().getSimpleName());
        return sb.toString();
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
}
