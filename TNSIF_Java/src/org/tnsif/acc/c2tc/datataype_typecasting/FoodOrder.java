package org.tnsif.acc.c2tc.datataype_typecasting;

public class FoodOrder {

	public static void main(String[] args) {
		//primitive datatype
		
		int orderId=101;
		double price=299.99;
		boolean isDelivered=false;
		char rating='A';
		float deliverDistance=5.3f;
		long deliveryBoyPhone=8155442361L;
		byte deliveryTime=45;
		short resturantId=12;
		//non primitive datatype
		
		String CustomerName="Anjali";
		String[] foodItem= {"Burger","Fries","Coke"};
		
		
		
		System.out.println("Order Summary");
		System.out.println("Customer Name :"+CustomerName);
		System.out.println("Order Id :"+orderId);
		System.out.println("ResturantID :"+resturantId);
		System.out.println("Delivery Boy :"+deliveryBoyPhone);
		System.out.println("Food Items :");
		for(String item:foodItem) {
			System.out.println("-"+item);
		}
		System.out.println("Total Price :"+price);
		System.out.println("Delivery Distance :"+deliverDistance);
		System.out.println("Expected Time"+deliveryTime);
		System.out.println("Delivery status :"+isDelivered);
		System.out.println("Rating :"+rating);
	}

}
