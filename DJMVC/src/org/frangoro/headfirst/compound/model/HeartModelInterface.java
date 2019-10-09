package org.frangoro.headfirst.compound.model;

import org.frangoro.headfirst.compound.view.BPMObserver;
import org.frangoro.headfirst.compound.view.BeatObserver;

public interface HeartModelInterface {
    public int getHeartRate();
    public void registerObserver(BeatObserver o);
    public void removeObserver(BeatObserver o);
    public void registerObserver(BPMObserver o);
    public void removeObserver(BPMObserver o);
}
