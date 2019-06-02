package com.kgc.mgr;

import com.kgc.vehicle.Bus;
import com.kgc.vehicle.Car;
import com.kgc.vehicle.MotoVehicle;
	//����ҵ����
public class MotoOperation {
	//�������͵����飬������������Ϊ��������
	public MotoVehicle[] motos = new MotoVehicle[8];
	
	//��ʼ��������Ϣ
	public void init(){
		motos[0] = new Car("��N78654","����",800,"X6"); // MotoVehicle m = new Car();
		motos[1] = new Car("��U78888","����",600,"550i"); // MotoVehicle m = new Car();
		motos[2] = new Car("��J65432","���",300,"������"); // MotoVehicle m = new Car();
		motos[3] = new Car("��N88964","���",600,"GL8"); // MotoVehicle m = new Car();
		motos[4] = new Bus("��I33333","��",800,16); // MotoVehicle m = new Car();
		motos[5] = new Bus("��I22222","��",1500,34); // MotoVehicle m = new Car();
		motos[6] = new Bus("��I55555","����",800,16); // MotoVehicle m = new Car();
		motos[7] = new Bus("��I66666","����",1500,34); // MotoVehicle m = new Car();
	}
	
	//�⳵:�����û��ṩ������ȥ���������в�����Ӧ�ĳ���������
	//������޵��ǿͳ�	��Ҫ��������Ʒ��	��λ��	�ͺ�null
	//������޵��ǽγ�	��Ҫ��������Ʒ��	�ͺ�	��λ��0
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