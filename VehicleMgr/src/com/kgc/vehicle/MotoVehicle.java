package com.kgc.vehicle;

public abstract class MotoVehicle {
	//���ƺ�	Ʒ��	�����
	private String vehicleId;
	private String brand;
	private int perRent;
	
	public MotoVehicle(){}

	public MotoVehicle(String vehicleId, String brand, int perRent) {
		super();
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.perRent = perRent;
	}

	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPerRent() {
		return perRent;
	}
	public void setPerRent(int perRent) {
		this.perRent = perRent;
	}
	//������𣨳��󷽷���
	public abstract float calcRent(int days);

}
