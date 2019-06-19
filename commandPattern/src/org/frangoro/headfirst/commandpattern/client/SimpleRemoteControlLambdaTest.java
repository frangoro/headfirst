package org.frangoro.headfirst.commandpattern.client;

import org.frangoro.headfirst.commandpattern.command.GarageDoorCommand;
import org.frangoro.headfirst.commandpattern.command.LightCommand;
import org.frangoro.headfirst.commandpattern.device.GarageDoor;
import org.frangoro.headfirst.commandpattern.device.Light;
import org.frangoro.headfirst.commandpattern.invoker.SimpleRemoteControl;
import org.frangoro.headfirst.commandpattern.invoker.SimpleRemoteControlLambda;

/**
 * This is the client
 */
public class SimpleRemoteControlLambdaTest {

    public static void main(String[] args) {
        // The invoker who order the request
        SimpleRemoteControlLambda src = new SimpleRemoteControlLambda();
        // The receiver of the request
        Light light = new Light();
        // The command requested in the request
        // LightCommand lightCommand = new LightCommand(light);
        // Now we can remove all commands and use straightforward
        // the request of each device by its lambda expression.
        // Pass the lambda to the invoker
        src.setCommand(()->{light.on();});
        // Invoke the command
        src.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        src.setCommand(garageDoor::up);
        src.buttonWasPressed();
    }
}
