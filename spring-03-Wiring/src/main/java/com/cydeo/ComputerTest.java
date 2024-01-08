package com.cydeo;

import com.cydeo.caseFactory.Case;
import com.cydeo.config.PcConfig;
import com.cydeo.monitorFactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Case theCase = container.getBean(Case.class);

        Monitor theMonitor= container.getBean(Monitor.class);

        System.out.println(theCase.getDimensions().getDepth());

        System.out.println(theMonitor.getModel());
    }
}
