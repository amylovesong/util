package com.sun.test;

import java.security.NoSuchAlgorithmException;

import com.sun.codec.SHACoder;

public class TestSHA {
	public static void main(String[] args) {
		String data = "asd123";
		System.out.println("raw data:" + data);

		// use java and Bouncy Castle API
		try {
			// SHA-1
			String encodedString = SHACoder.encodeSHA(data.getBytes(),
					SHACoder.SHA_1);
			System.out.println("SHA-1:" + encodedString + " length:"
					+ encodedString.length());
			// SHA-256
			encodedString = SHACoder.encodeSHA(data.getBytes(),
					SHACoder.SHA_256);
			System.out.println("SHA-256:" + encodedString + " length:"
					+ encodedString.length());
			// SHA-384
			encodedString = SHACoder.encodeSHA(data.getBytes(),
					SHACoder.SHA_384);
			System.out.println("SHA-384:" + encodedString + " length:"
					+ encodedString.length());
			// SHA-512
			encodedString = SHACoder.encodeSHA(data.getBytes(),
					SHACoder.SHA_512);
			System.out.println("SHA-512:" + encodedString + " length:"
					+ encodedString.length());

			System.out.println();

			// SHA-224
			encodedString = SHACoder.encodeSHA224(data.getBytes());
			System.out.println("SHA-224:" + encodedString + " length:"
					+ encodedString.length());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		System.out.println();

		// use Commons Codec API
		// SHA-1
		byte[] encodedByte = SHACoder.encodeSHA(data.getBytes());
		String encodedString = SHACoder.encodeSHAHex(data.getBytes());
		sysOP("SHA-1", encodedByte, encodedString);
		// SHA-256
		encodedByte = SHACoder.encodeSHA256(data.getBytes());
		encodedString = SHACoder.encodeSHA256Hex(data.getBytes());
		sysOP(SHACoder.SHA_256, encodedByte, encodedString);
		// SHA-384
		encodedByte = SHACoder.encodeSHA384(data.getBytes());
		encodedString = SHACoder.encodeSHA384Hex(data.getBytes());
		sysOP(SHACoder.SHA_384, encodedByte, encodedString);
		// SHA-512
		encodedByte = SHACoder.encodeSHA512(data.getBytes());
		encodedString = SHACoder.encodeSHA512Hex(data.getBytes());
		sysOP(SHACoder.SHA_512, encodedByte, encodedString);
	}

	private static void sysOP(String SHA, byte[] encodedByte,
			String encodedString) {
		System.out.println(SHA + " byte:" + encodedByte + " str:"
				+ encodedString + " length:" + encodedString.length());
	}
}
