package org.frangoro.headfirst.compound.controller;

import org.frangoro.headfirst.compound.model.HeartAdapter;
import org.frangoro.headfirst.compound.model.HeartModelInterface;
import org.frangoro.headfirst.compound.view.DJView;

public class HeartController implements ControllerInterface {

    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }
}
