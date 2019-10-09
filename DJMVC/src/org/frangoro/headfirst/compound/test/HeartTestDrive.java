package org.frangoro.headfirst.compound.test;

import org.frangoro.headfirst.compound.controller.BeatController;
import org.frangoro.headfirst.compound.controller.ControllerInterface;
import org.frangoro.headfirst.compound.controller.HeartController;
import org.frangoro.headfirst.compound.model.BeatModel;
import org.frangoro.headfirst.compound.model.BeatModelInterface;
import org.frangoro.headfirst.compound.model.HeartModel;
import org.frangoro.headfirst.compound.model.HeartModelInterface;

public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModelInterface model = new HeartModel();
        ControllerInterface controller  = new HeartController(model);
    }
}
