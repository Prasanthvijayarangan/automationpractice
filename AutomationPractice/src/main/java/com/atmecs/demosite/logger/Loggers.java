package com.atmecs.demosite.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.atmecs.demosite.Standardfile.Standardfile;

public class Loggers {

	Logger log;
	public Loggers() {
		configureLogger();
		log = Logger.getLogger(Loggers.class.getName());
	}
	
	public void configureLogger() {
		PropertyConfigurator.configure(Standardfile.LOG4J_FILE);
	}
	
	public void info(String message) {
		
		log.info(message);
	}

	
}
