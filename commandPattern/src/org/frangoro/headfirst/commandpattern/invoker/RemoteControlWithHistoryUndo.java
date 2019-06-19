package org.frangoro.headfirst.commandpattern.invoker;

import org.frangoro.headfirst.commandpattern.command.Command;
import org.frangoro.headfirst.commandpattern.command.NoCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoteControlWithHistoryUndo {

    Command[] onCommands;
    Command[] offCommands;
    Deque<Command> historyCommands;

    public RemoteControlWithHistoryUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];
       historyCommands = new ArrayDeque<>();

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        historyCommands.push(offCommands[slot]);
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        historyCommands.push(onCommands[slot]);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n--- Remote Control ---\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[Slot " + i + "] " + onCommands[i].getClass().getName() + " - " + offCommands[i].getClass().getName() + "\n");
            sb.append("[Undo] " + historyCommands.peekLast().getClass().getName());
        }
        return sb.toString();
    }

    public void undoButtonWasPressed() {
        if (historyCommands.isEmpty()) {
            new org.frangoro.headfirst.commandpattern.command.NoCommand().execute();
        } else {
            historyCommands.pop().execute();
        }
    }

}
