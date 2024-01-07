package com.cydeo.streotype_annotation.monitorFactory;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // that annotation says, which bean will be used as a monitor bean (Sony or Acer)
public class SonyMonitor extends Monitor{

    public SonyMonitor() {
        super("50 inch beast","Sony",50);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}