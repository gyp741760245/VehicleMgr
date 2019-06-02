package com.kgc.mgr;

import com.kgc.vehicle.Bus;
import com.kgc.vehicle.Car;
import com.kgc.vehicle.MotoVehicle;
	//汽车业务类
public class MotoOperation {
	//汽车类型的数组，将该数组声明为父类类型
	public MotoVehicle[] motos = new MotoVehicle[8];
	
	//初始化汽车信息
	public void init(){
		motos[0] = new Car("京N78654","宝马",800,"X6"); // MotoVehicle m = new Car();
		motos[1] = new Car("京U78888","宝马",600,"550i"); // MotoVehicle m = new Car();
		motos[2] = new Car("京J65432","别克",300,"林荫大道"); // MotoVehicle m = new Car();
		motos[3] = new Car("京N88964","别克",600,"GL8"); // MotoVehicle m = new Car();
		motos[4] = new Bus("京I33333","金杯",800,16); // MotoVehicle m = new Car();
		motos[5] = new Bus("京I22222","金杯",1500,34); // MotoVehicle m = new Car();
		motos[6] = new Bus("京I55555","金龙",800,16); // MotoVehicle m = new Car();
		motos[7] = new Bus("京I66666","金龙",1500,34); // MotoVehicle m = new Car();
	}
	
	//租车:根据用户提供的条件去汽车数组中查找相应的车辆并返回
	//如果租赁的是客车	需要的条件：品牌	座位数	型号null
	//如果租赁的是轿车	需要的条件：品牌	型号	座位数0
	public MotoVehicle motoLeaseOut(String brand,String type,int seat){
		MotoVehicle moto = null;
		for(MotoVehicle mymoto : motos){
			if(mymoto instanceof Car){
				Car car = (Car)mymoto;
				if(car.getBrand().equals(brand) && car.getType().equals(type)){
					moto = car;
					break;
				}
			}else{
				Bus bus = (Bus)mymoto;
				if(bus.getBrand().equals(brand) && bus.getseatCount() == seat){
					moto = bus;
					break;
				}
			}
		}
		return moto;
	}
	
	
}