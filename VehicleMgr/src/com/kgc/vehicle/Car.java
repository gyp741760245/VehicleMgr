package com.kgc.vehicle;
//½Î³µÀà
public class Car extends MotoVehicle {
	//ÐÍºÅ
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Car(){}

	public Car(String vehicleId, String brand, int perRent,String type) {
		super(vehicleId,brand,perRent);
		this.type = type;
	}

	public float calcRent(int days) {
		float price = this.getPerRent() * days;
		if(days>7 && days<=30){
			price *=0.9f;
		}else if(days>30 && days<=150){
			price *=0.8f;
		}else if(days>150){
			price *=0.7f;
		}
		return price;
	}

}
