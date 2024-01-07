package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.caseFactory.Case;
import com.cydeo.streotype_annotation.config.PcConfig;
import com.cydeo.streotype_annotation.monitorFactory.Monitor;
import com.cydeo.streotype_annotation.motherboardFactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        // Container created
        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        // We put monitor instance in the theMonitor object, and we can use whenever we want
        // We say which instance we use thanks to @primary annotation
        Monitor theMonitor = container.getBean(Monitor.class);
        Motherboard theMotherboard= container.getBean(Motherboard.class);

        System.out.println(theMonitor.getModel());
        System.out.println(theMotherboard.getBios());

    }
}
