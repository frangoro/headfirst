package org.frangoro.headfirst.commandpattern.command;

import org.frangoro.headfirst.commandpattern.device.Light;

/**
 * This is the command
 */
public class LightCommand implements Command {

    // Who
    Light light;

    public LightCommand (Light light) {
        this.light = light;
    }

    // How
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
