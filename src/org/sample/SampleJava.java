package org.sample;

public class SampleJava {

	public static void main(String[] args) {

		String s = "hi   java   is  programming  language";
		s = s.replaceAll("\\s", "");
		System.out.println(s);
	}

	public void add() {
		System.out.println("add of two given number");

	}

	public void sub() {
		System.out.println("sub of two given number");

	}

	public void product() {
		System.out.println("Product of two given number");

	}

}
