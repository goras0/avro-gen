package test.model;

import lombok.Data;

public class UpdateEvent {
	int id;
	String name;
	ProductArrangement pdAr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductArrangement getPdAr() {
		return pdAr;
	}
	public void setPdAr(ProductArrangement pdAr) {
		this.pdAr = pdAr;
	}
	
	
}
