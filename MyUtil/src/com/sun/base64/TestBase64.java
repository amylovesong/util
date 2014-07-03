package com.sun.base64;

import java.io.UnsupportedEncodingException;

/**
 * Base64 test code
 * 
 * @author sxl
 * 
 */
public class TestBase64 {
	public static void main(String[] args) {
		String data = "Ad3";

		// use Bouncy Castle API
		try {
			// encode
			String encodedString = Base64Coder.encode(data);
			System.out.println(encodedString);
			// decode
			String decodedString = Base64Coder.decode(encodedString);
			System.out.println(decodedString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}
