package org.frangoro.headfirst.commandpattern.client;

import org.frangoro.headfirst.commandpattern.command.*;
import org.frangoro.headfirst.commandpattern.device.CeilingFan;
import org.frangoro.headfirst.commandpattern.device.Light;
import org.frangoro.headfirst.commandpattern.invoker.RemoteControl;
import org.frangoro.headfirst.commandpattern.invoker.RemoteControlWithUndo;

public class RemoteLoader2 {

    public static void main (String args []) {
        // the invoker
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // the receiver
        CeilingFan ceilingFan = new CeilingFan("Bed Room");

        // the commands
        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0,highCommand, offCommand);
        remoteControl.setCommand(1,lowCommand, offCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

    }
}
