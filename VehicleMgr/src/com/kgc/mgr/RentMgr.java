package com.kgc.mgr;

import java.util.Scanner;

import com.kgc.vehicle.MotoVehicle;

public class RentMgr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MotoOperation motoMgr = new MotoOperation();
		//���޹�˾������Ҫ��������
		motoMgr.init();
		System.out.println("*****��ӭ�������޹�˾******");
		System.out.println("1 �γ�\t2 �ͳ�");
		System.out.println("��ѡ����Ҫ���޵��������ͣ�");
		int motoType = input.nextInt();
		String brand ="";//Ʒ��
		String type	="";//�ͺ�
		int seat = 0;//��λ��
		
		if(motoType == 1){
			//��������
			System.out.println("��ѡ����Ҫ���޵Ľγ�Ʒ�ƣ�1�����  2������");
			int choose = input.nextInt();
			if(choose == 1){
				brand = "���";
				System.out.println("��ѡ����Ҫ���޶��������ͺţ�1�������� 2��GL8");
				type = (input.nextInt() == 1)?"������":"GL8";
			}else if(choose == 2){
				brand = "����";
				System.out.println("��ѡ����Ҫ���޶��������ͺţ�1��X6 2��550i");
				type = (input.nextInt() == 1)?"X6":"550i";
			}
			
		}else if(motoType == 2){
			//���޿ͳ�
			type = "";
			System.out.println("��ѡ����Ҫ���޵Ŀͳ�Ʒ�ƣ�1����  2������");
			brand = (input.nextInt()==1)?"��":"����";
			System.out.println("��ѡ����Ҫ���޵Ŀͳ���λ����1��16��  2��34��");
			seat = (input.nextInt()==1)?16:34;
		}
		//�⳵
		MotoVehicle moto = motoMgr.motoLeaseOut(brand, type, seat);
		System.out.println("��������Ҫ���޵�����");
		int days = input.nextInt();
		float money = moto.calcRent(days);
		System.out.println("�⳵�ɹ�������ĳ��ĳ��ƺ���"+moto.getVehicleId());
		System.out.println("����Ҫ֧����"+money+"Ԫ");
	}
}
