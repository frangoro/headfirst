package org.frangoro.headfirst.commandpattern.command;

import org.frangoro.headfirst.commandpattern.device.Light;

/**
 * This is the command
 */
public class LightOffCommand implements Command {

    // Who
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    // How
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
