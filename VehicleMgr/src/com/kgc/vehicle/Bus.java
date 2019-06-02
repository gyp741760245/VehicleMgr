package com.kgc.vehicle;

public class Bus extends MotoVehicle {
	private int seatCount;

	public int getseatCount() {
		return seatCount;
	}

	public void seatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	public Bus(){}

	public Bus(String vehicleId, String brand, int perRent,int seatCount) {
		super(vehicleId,brand,perRent);
		this.seatCount = seatCount;
	}

	//��д����ļ�����𷽷��������Լ��ļ���������
	public float calcRent(int days) {
		float price = this.getPerRent() * days;
		if(days>=3 && days<7){
			price *=0.9f;
		}else if(days>=7 && days<30){
			price *=0.8f;
		}else if(days>=30 && days<150){
			price *=0.7f;
		}else if(days>=150){
			price *=0.6f;
		}
		return price;
	}

}
