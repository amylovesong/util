package com.sun.test;

import java.io.UnsupportedEncodingException;

import com.sun.codec.Base64Coder;
import com.sun.codec.Base64CoderCC;

/**
 * Base64 test code
 * 
 * @author sxl
 * 
 */
public class TestBase64 {
	public static void main(String[] args) {
		String data = "Ad31";

		// use Bouncy Castle API
		try {
			System.out.println("Bouncy Castle:");
			// encode
			String encodedString = Base64Coder.encode(data);
			System.out.println(encodedString);
			// decode
			String decodedString = Base64Coder.decode(encodedString);
			System.out.println(decodedString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// use Commons Codec API
		try {
			System.out.println("Commons Codec:");
			// encode
			String encodedString = Base64CoderCC.encodeSafe(data);// 这种编码方式的输出会多一个换行符
			System.out.println(encodedString);
			String decodedString = Base64CoderCC.decode(encodedString);
			System.out.println(decodedString);

			encodedString = Base64CoderCC.encode(data);// 这种编码方式的输出没有换行符
			System.out.println(encodedString);
			decodedString = Base64CoderCC.decode(encodedString);
			System.out.println(decodedString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
