package com.atmecs.demosite.pathallocator;


import java.io.IOException;
import java.util.Properties;

import com.atmecs.demosite.Standardfile.Standardfile;
import com.atmecs.demosite.utils.ReadLocatorsfile;


public class PathallocatorValidation {
	Properties properties;


	
	
	public void getdata() throws IOException {
		properties=ReadLocatorsfile.loadProperty(Standardfile.Validation_config);
	
	}
	
	
}

