package test.model;

import lombok.Data;


public class Event {
	int id;
	String name;
	ProductArrangement pdAr;
	UpdateEvent updateEvent;

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
	public UpdateEvent getUpdateEvent() {
		return updateEvent;
	}
	public void setUpdateEvent(UpdateEvent updateEvent) {
		this.updateEvent = updateEvent;
	}
	

}
