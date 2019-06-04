package org.frangoro.headfirst.commandpattern.client;

import org.frangoro.headfirst.commandpattern.command.GarageDoorCommand;
import org.frangoro.headfirst.commandpattern.command.LightCommand;
import org.frangoro.headfirst.commandpattern.device.GarageDoor;
import org.frangoro.headfirst.commandpattern.device.Light;
import org.frangoro.headfirst.commandpattern.invoker.SimpleRemoteControl;

/**
 * This is the client
 */
public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        // The invoker who order the request
        SimpleRemoteControl src = new SimpleRemoteControl();
        // The receiver of the request
        Light light = new Light();
        // The command requested in the request
        LightCommand lightCommand = new LightCommand(light);
        // Pass the command to the invoker
        src.setCommand(lightCommand);
        // Invoke the command
        src.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorCommand garageDoorCommand = new GarageDoorCommand(garageDoor);
        src.setCommand(garageDoorCommand);
        src.buttonWasPressed();
    }
}
