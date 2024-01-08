package com.cydeo.config;

import com.cydeo.caseFactory.Case;
import com.cydeo.caseFactory.DellCase;
import com.cydeo.caseFactory.Dimensions;

import com.cydeo.monitorFactory.Monitor;
import com.cydeo.monitorFactory.SonyMonitor;
import com.cydeo.motherboardFactory.AsusMotherboard;
import com.cydeo.motherboardFactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PcConfig {

    @Bean
    public Dimensions dimensions(){

        return new Dimensions(50,10,10);
    }


    @Bean
    public Case caseDell(Dimensions dimensions){

        return new DellCase("220B","Dell","240",dimensions);
    }
    @Bean
    public Monitor sony(){
        return new SonyMonitor("25 inch beast","Sony",25);
    }
    @Bean
    public Motherboard motherBoardAsus(){

        return new AsusMotherboard("BJ200","Asus",4,6,"v2.44");
    }
}
