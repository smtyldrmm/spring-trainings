package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.caseFactory.Case;
import com.cydeo.streotype_annotation.monitorFactory.Monitor;
import com.cydeo.streotype_annotation.motherboardFactory.Motherboard;
import lombok.Getter;

@Getter
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt();
    }

}
