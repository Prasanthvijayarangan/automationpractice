package com.atmecs.demosite.pathallocator;


import java.io.IOException;
import java.util.Properties;

import com.atmecs.demosite.Standardfile.Standardfile;
import com.atmecs.demosite.utils.ReadLocatorsfile;


public class PathallocatorValidation {
	Properties property;
	String Product1;
	String Product2;
	String Product3;
	String Product4;
	String Product5;
	String Product6;
	String Product7;
	


	
	
	





	public void getdata() throws IOException {
		property = ReadLocatorsfile.loadProperty(Standardfile.Validation_config);
	setProduct1();
	setProduct2();
	setProduct3();
	setProduct4();
	setProduct5();
	setProduct6();
	setProduct7();
	}
	public String getProduct1() {
		return Product1;
	}
	public void setProduct1() {
		Product1 = property.getProperty("val.img.product1");
	}
    public String getProduct2() {
		return Product2;
	}
	public void setProduct2() {
		Product2 = property.getProperty("val.img.product2");
	}
	public String getProduct3() {
		return Product3;
	}
	public void setProduct3() {
		Product3 = property.getProperty("val.img.product3");
	}
	public String getProduct4() {
		return Product4;
	}
	public void setProduct4() {
		Product4 = property.getProperty("val.img.product4");
	}
	public String getProduct5() {
		return Product5;
	}
	public void setProduct5() {
		Product5 = property.getProperty("val.img.product5");
	}
	public String getProduct6() {
		return Product6;
	}
	public void setProduct6() {
		Product6 = property.getProperty("val.img.product6");
	}
	public String getProduct7() {
		return Product7;
	}
	public void setProduct7() {
		Product7 = property.getProperty("val.img.product7");
	}
	
}

