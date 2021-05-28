package org.sample;

public class SampleJava {

	public static void main(String[] args) {

		String s = "hi   java   is  programming  language";
		s = s.replaceAll("\\s", "");
		System.out.println(s);
	}

}
