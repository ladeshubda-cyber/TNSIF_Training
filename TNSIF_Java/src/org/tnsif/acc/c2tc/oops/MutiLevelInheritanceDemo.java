package org.tnsif.acc.c2tc.oops;
//
class Device{
	void deviceType() {
		System.out.println("I ama a Electronic Device");
	}
}
class Phone extends Device{
	void brand() {
		System.out.println("Brand:Samsung");
	}
}
class SmartPhone extends Phone{
	void feature() {
		System.out.println("Features,TouchScreen,Camera,Intenet");
	}
}
public class MutiLevelInheritanceDemo {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone();
		smartphone.deviceType();
		smartphone.brand();
		smartphone.feature();

	}

}
