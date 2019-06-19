package org.frangoro.headfirst.commandpattern.client;

import org.frangoro.headfirst.commandpattern.command.LightCommand;
import org.frangoro.headfirst.commandpattern.command.LightOffCommand;
import org.frangoro.headfirst.commandpattern.device.Light;
import org.frangoro.headfirst.commandpattern.invoker.RemoteControlWithHistoryUndo;

/*
The client
 */
public class RemoteControlWithHistoryUndoTest {

    public static void main (String args []) {
        // the invoker
        RemoteControlWithHistoryUndo remoteControlWithHistoryUndo = new RemoteControlWithHistoryUndo();

        // the receiver
        Light light = new Light();

        // the commands
        LightCommand onLightCommand = new LightCommand(light);
        LightOffCommand offLightCommand = new LightOffCommand(light);

        remoteControlWithHistoryUndo.setCommand(0,onLightCommand, offLightCommand);
        System.out.println(remoteControlWithHistoryUndo);

        remoteControlWithHistoryUndo.onButtonWasPressed(0);
        remoteControlWithHistoryUndo.offButtonWasPressed(0);
        remoteControlWithHistoryUndo.undoButtonWasPressed();
        remoteControlWithHistoryUndo.offButtonWasPressed(0);
        remoteControlWithHistoryUndo.undoButtonWasPressed();

    }
}
