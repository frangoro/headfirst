package org.frangoro.headfirst.commandpattern.client;

import org.frangoro.headfirst.commandpattern.command.LightCommand;
import org.frangoro.headfirst.commandpattern.command.LightOffCommand;
import org.frangoro.headfirst.commandpattern.device.Light;
import org.frangoro.headfirst.commandpattern.invoker.RemoteControl;

/*
The client
 */
public class RemoteLoader {

    public static void main (String args []) {
        // the invoker
        RemoteControl remoteControl = new RemoteControl();

        // the receiver
        Light light = new Light();

        // the commands
        LightCommand onLightCommand = new LightCommand(light);
        LightOffCommand offLightCommand = new LightOffCommand(light);

        remoteControl.setCommand(0,onLightCommand, offLightCommand);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

    }
}
