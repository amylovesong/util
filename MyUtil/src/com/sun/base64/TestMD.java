package com.sun.base64;

import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;

public class TestMD {
	public static void main(String[] args) {
		String testString = "1234asdfgh";

		try {
			System.out.println("raw data:" + testString);
			System.out.println("MD2:"
					+ MDCoder.encodeMD2(testString.getBytes()));
			System.out.println("MD5:"
					+ MDCoder.encodeMD5(testString.getBytes()));

			System.out.println("empty string MD5:"
					+ MDCoder.encodeMD5("".getBytes()));

			System.out.println("MD4:"
					+ MDCoder.encodeMD4(testString.getBytes()));

			// 十六进制的字符串
			System.out.println("MD5 Hex："
					+ MDCoder.encodeMD5Hex(testString.getBytes()));

			// 字节数组
			byte[] digest = MDCoder.encodeMD5Decimalism(testString.getBytes());
			String dString = new String(Hex.encodeHex(digest));
			System.out.println("MD5 decimalism：" + digest + "\n"
					+ "convert to Hex：" + dString);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

	}
}
