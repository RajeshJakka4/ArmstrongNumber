package com.java;

class Vehicle {
	public void CarWashGuideLines() {
		System.out.println("use water to wash: ");
	}
}
class TwoWheeler extends Vehicle{
	public void Services() {
		System.out.println("service the two wheelers onece for 2000kms of ride ");
	}
}
class KTM extends TwoWheeler{
	public void RidingSafety() {
		System.out.println("wear helment ");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KTM k = new KTM();
		k.CarWashGuideLines();
		k.Services();
		k.RidingSafety();
		

	}

}
