package com.atmecs.demosite.pathallocator;


import java.util.Properties;

import com.atmecs.demosite.Standardfile.Standardfile;
import com.atmecs.demosite.utils.ReadLocatorsfile;



public class Pathallocator {
	Properties property;
	String Product;
	String AddProduct;
	String ProductProceed;
	String Column;
	String Row;
	
  






	
	public void getdata() throws Exception {
		property = ReadLocatorsfile.loadProperty(Standardfile.Locator_config);
		setProduct();
		setAddProduct();
		setProductProceed();
		setColumn();
		setRow();
	}
	public String getProductProceed() {
		return ProductProceed;
	}
	public void setProductProceed() {
		ProductProceed = property.getProperty("loc.click.proceed");
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct() {
		Product = property.getProperty("loc.img.click");
	}
	public String getAddProduct() {
		return AddProduct;
	}
	public void setAddProduct() {
		AddProduct = property.getProperty("loc.add.product");
	}
	public String getColumn() {
		return Column;
	}
	public void setColumn() {
		Column = property.getProperty("loc.col.table");
	}
	public String getRow() {
		return Row;
	}
	public void setRow() {
		Row = property.getProperty("loc.row.table");
	}
}
