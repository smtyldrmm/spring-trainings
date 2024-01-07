package com.cydeo.streotype_annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cydeo") // ComponentScan annotation scans which pages has @Component annotation and create beans
// As a default, when we don't write anything, it checks which package it is in
public class PcConfig {

}
