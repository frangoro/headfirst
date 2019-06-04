package org.frangoro.headfirst.commandpattern.command;

import org.frangoro.headfirst.commandpattern.device.GarageDoor;

public class GarageDoorCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
