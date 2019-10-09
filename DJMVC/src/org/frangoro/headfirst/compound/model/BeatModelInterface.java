package org.frangoro.headfirst.compound.model;

import org.frangoro.headfirst.compound.view.BPMObserver;
import org.frangoro.headfirst.compound.view.BeatObserver;

/*
The Model API
 */
public interface BeatModelInterface {

    // Methods the Controller will use to direct the model
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);

    // Methods the View and the Controller use to get the status
    int getBPM();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
