package com.sun.test;

public class TestUtil {
	public static void sysOP(String algorithm, String encodedString) {
		System.out.println("\n" + algorithm + "\n" + "encodedString:"
				+ encodedString + "\n" + "length:" + encodedString.length());
	}

	public static void sysOP(String algorithm, byte[] key, String encodedString) {
		System.out.println("\n" + algorithm + "\n" + "key:" + key + "\n"
				+ "encodedString:" + encodedString + "\n" + "length:"
				+ encodedString.length());
	}
}
