package org.tnsif.acc.c2tc.interfacedemo;
class SmartLight implements SmartDevice{

	@Override
	public void turnon() {
		System.out.println("SmartLight is on");
		
	}

	@Override
	public void turnoff() {
		System.out.println("SmartLight is off");
		
	}

	@Override
	public void getstatus() {
		System.out.println("SmartLight is StandbyMode");
		
	}
	
}
public class Interfacedemo {

	public static void main(String[] args) {
		SmartDevice smart=new SmartLight();
		smart.turnon();
		smart.turnoff();
		smart.getstatus();

	}

}
