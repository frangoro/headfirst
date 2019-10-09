package org.frangoro.headfirst.compound.test;

import org.frangoro.headfirst.compound.controller.BeatController;
import org.frangoro.headfirst.compound.controller.ControllerInterface;
import org.frangoro.headfirst.compound.model.BeatModel;
import org.frangoro.headfirst.compound.model.BeatModelInterface;

public class DJViewTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller  = new BeatController(model);
    }
}
