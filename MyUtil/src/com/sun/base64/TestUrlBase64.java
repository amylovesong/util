package com.sun.base64;

import java.io.UnsupportedEncodingException;

/**
 * UrlBase64 test code
 * 
 * @author sxl
 * 
 */
public class TestUrlBase64 {
	public static void main(String[] args) {
		String data = "Ad31";

		// use Bouncy Castle API
		try {
			System.out.println("Bouncy Castle:");
			// encode
			String encodedString = UrlBase64Coder.encode(data);
			System.out.println(encodedString);
			// decode
			String decodedString = UrlBase64Coder.decode(encodedString);
			System.out.println(decodedString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// use Commons Codec API
		try {
			System.out.println("Commons Codec:");
			// encode
			String encodedString = UrlBase64CoderCC.encode(data);
			System.out.println(encodedString);
			// decode
			String decodedString = UrlBase64CoderCC.decode(encodedString);
			System.out.println(decodedString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}
