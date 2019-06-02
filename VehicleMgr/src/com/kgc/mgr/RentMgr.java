package com.kgc.mgr;

import java.util.Scanner;

import com.kgc.vehicle.MotoVehicle;

public class RentMgr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MotoOperation motoMgr = new MotoOperation();
		//租赁公司首先需要购置汽车
		motoMgr.init();
		System.out.println("*****欢迎光临租赁公司******");
		System.out.println("1 轿车\t2 客车");
		System.out.println("请选择您要租赁的汽车类型：");
		int motoType = input.nextInt();
		String brand ="";//品牌
		String type	="";//型号
		int seat = 0;//座位数
		
		if(motoType == 1){
			//租赁汽车
			System.out.println("请选择您要租赁的轿车品牌：1、别克  2、宝马");
			int choose = input.nextInt();
			if(choose == 1){
				brand = "别克";
				System.out.println("请选择您要租赁耳朵汽车型号：1、林荫大道 2、GL8");
				type = (input.nextInt() == 1)?"林荫大道":"GL8";
			}else if(choose == 2){
				brand = "宝马";
				System.out.println("请选择您要租赁耳朵汽车型号：1、X6 2、550i");
				type = (input.nextInt() == 1)?"X6":"550i";
			}
			
		}else if(motoType == 2){
			//租赁客车
			type = "";
			System.out.println("请选择您要租赁的客车品牌：1、金杯  2、金龙");
			brand = (input.nextInt()==1)?"金杯":"金龙";
			System.out.println("请选择您要租赁的客车座位数：1、16座  2、34座");
			seat = (input.nextInt()==1)?16:34;
		}
		//租车
		MotoVehicle moto = motoMgr.motoLeaseOut(brand, type, seat);
		System.out.println("请输入您要租赁的天数");
		int days = input.nextInt();
		float money = moto.calcRent(days);
		System.out.println("租车成功，你租的车的车牌号是"+moto.getVehicleId());
		System.out.println("您需要支付："+money+"元");
	}
}
