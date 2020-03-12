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
	String ScrollPage;
	String Rowdata;
	String GetHeaders;
	String ParticularData;
	String ContinueShop;
	String ScrollTill;
	String Pagelogo;
	String Womenmenu;
	String Dressesmenu;
	String Tshirtmenu;
	String Tshirtsubmenu;
	String Blousessubmenu;
	String Casualdress;
	String Eveningdress;
	String Summerdress;
	String Casual;
	String Evening;
	String Summer;
	
 

	
	
	public void getdata() throws Exception {
		property = ReadLocatorsfile.loadProperty(Standardfile.Locator_config);
		setProduct();
		setAddProduct();
		setProductProceed();
		setColumn();
		setRow();
		setScrollPage();
		setRowdata();
		setGetHeaders();
		setParticularData();
		setContinueShop();
		setScrollTill();
		setPagelogo();
		setWomenmenu();
		setDressesmenu();
		setTshirtmenu();
		setTshirtsubmenu();
		setBlousessubmenu();
		setCasualdress();
		setEveningdress();
		setSummerdress();
		setCasual();
		setEvening();
		setSummer();
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
	public String getScrollPage() {
		return ScrollPage;
	}
	public void setScrollPage() {
		ScrollPage = property.getProperty("loc.scroll.page");
	}
	public String getRowdata() {
		return Rowdata;
	}
	public void setRowdata() {
		Rowdata = property.getProperty("loc.get.data");
	}
	public String getGetHeaders() {
		return GetHeaders;
	}
	public void setGetHeaders() {
		GetHeaders = property.getProperty("loc.get.allheaders");
	}
	public String getParticularData() {
		return ParticularData;
	}
	public void setParticularData() {
		ParticularData = property.getProperty("loc.get.particulardata");
	}
	public String getContinueShop() {
		return ContinueShop;
	}
	public void setContinueShop() {
		ContinueShop = property.getProperty("loc.click.continue");
	}
	public String getScrollTill() {
		return ScrollTill;
	}
	public void setScrollTill() {
		ScrollTill = property.getProperty("loc.scroll.tillelement");
	}
	public String getPagelogo() {
		return Pagelogo;
	}
	public void setPagelogo() {
		Pagelogo = property.getProperty("loc.click.logo");
	}
	public String getWomenmenu() {
		return Womenmenu;
	}
	public void setWomenmenu() {
		Womenmenu = property.getProperty("loc.menu.women");
	}
	public String getDressesmenu() {
		return Dressesmenu;
	}
	public void setDressesmenu() {
		Dressesmenu = property.getProperty("loc.menu.dresses");
	}
	public String getTshirtmenu() {
		return Tshirtmenu;
	}
	public void setTshirtmenu() {
		Tshirtmenu = property.getProperty("loc.menu.tshirt");
	}
	public String getTshirtsubmenu() {
		return Tshirtsubmenu;
	}
	public void setTshirtsubmenu() {
		Tshirtsubmenu = property.getProperty("loc.submenu.tshirt");
	}
	public String getBlousessubmenu() {
		return Blousessubmenu;
	}
	public void setBlousessubmenu() {
		Blousessubmenu = property.getProperty("loc.submenu.blouses");
	}
	public String getCasualdress() {
		return Casualdress;
	}
	public void setCasualdress() {
		Casualdress = property.getProperty("loc.submenu.casualdress");
	}
	public String getEveningdress() {
		return Eveningdress;
	}
	public void setEveningdress() {
		Eveningdress = property.getProperty("loc.submenu.eveningdress");
	}
	public String getSummerdress() {
		return Summerdress;
	}
	public void setSummerdress() {
		Summerdress = property.getProperty("loc.submenu.summerdress");
	}
	public String getCasual() {
		return Casual;
	}
	public void setCasual() {
		Casual = property.getProperty("loc.women.casualdress");
	}
	public String getEvening() {
		return Evening;
	}
	public void setEvening() {
		Evening = property.getProperty("loc.women.eveningdress");
	}
	public String getSummer() {
		return Summer;
	}
	public void setSummer() {
		Summer = property.getProperty("loc.women.summerdress");
	}
}
