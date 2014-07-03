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
		/*
		 * try { // encode String encodedString = Base64Coder.encode(data);
		 * System.out.println(encodedString); // decode String decodedString =
		 * Base64Coder.decode(encodedString); System.out.println(decodedString);
		 * } catch (UnsupportedEncodingException e) { e.printStackTrace(); }
		 */

		// use Commons Codec API
		try {
			// encode
			String encodedString = Base64CoderCC.encodeSafe(data);// ���ֱ��뷽ʽ��������һ�����з�
			System.out.println(encodedString);
			String decodedString = Base64CoderCC.decode(encodedString);
			System.out.println(decodedString);

			encodedString = Base64CoderCC.encode(data);// ���ֱ��뷽ʽ�����û�л��з�
			System.out.println(encodedString);
			decodedString = Base64CoderCC.decode(encodedString);
			System.out.println(decodedString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
