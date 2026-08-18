package org.tnsif.acc.c2tc.exceptionhandaling;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("Hello");

	}

}
