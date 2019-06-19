package org.frangoro.headfirst.commandpattern.client;

import org.frangoro.headfirst.commandpattern.command.*;
import org.frangoro.headfirst.commandpattern.device.CeilingFan;
import org.frangoro.headfirst.commandpattern.device.Light;
import org.frangoro.headfirst.commandpattern.invoker.RemoteControlWithUndo;

public class RemoteControlWithMacroTest {

    public static void main (String args []) {
        // the invoker
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // the receiver
        CeilingFan ceilingFan = new CeilingFan("Bed Room");
        Light light = new Light();

        // the commands
        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(ceilingFan);

        LightCommand lightOnCommand = new LightCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Command[] offCommands = {offCommand, lightOffCommand};
        Command[] onCommands = {highCommand, lowCommand, lightOnCommand};
        MacroCommand macroOnCommand = new MacroCommand(onCommands);
        MacroCommand macroOffCommand = new MacroCommand(offCommands);

        remoteControl.setCommand(0,macroOnCommand, macroOffCommand);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

    }
}
