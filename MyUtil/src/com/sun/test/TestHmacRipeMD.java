package com.sun.test;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import com.sun.codec.HmacRipeMDCoder;

public class TestHmacRipeMD {
	private static byte[] keyHmacRipeMD;

	private static String key = "F1443D5F7E5ED98B2C749FD1A55C38D0";

	public static void main(String[] args) {
		String data = "asdasd";
		System.out.println("raw data:" + data);

		try {
			// HmacRipeMD128
			keyHmacRipeMD = HmacRipeMDCoder
					.initHmacRipeMDKey(HmacRipeMDCoder.HmacRipeMD128);
			// keyHmacRipeMD = key.getBytes();
			String encodedString = HmacRipeMDCoder.encodeHmacRipeMD(
					data.getBytes(), keyHmacRipeMD,
					HmacRipeMDCoder.HmacRipeMD128);
			TestUtil.sysOP(HmacRipeMDCoder.HmacRipeMD128, keyHmacRipeMD,
					encodedString);

			// HmacRipeMD160
			keyHmacRipeMD = HmacRipeMDCoder
					.initHmacRipeMDKey(HmacRipeMDCoder.HmacRipeMD160);
			encodedString = HmacRipeMDCoder.encodeHmacRipeMD(data.getBytes(),
					keyHmacRipeMD, HmacRipeMDCoder.HmacRipeMD160);
			TestUtil.sysOP(HmacRipeMDCoder.HmacRipeMD160, keyHmacRipeMD,
					encodedString);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		}
	}
}
