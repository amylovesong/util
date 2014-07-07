package com.sun.test;

import java.security.NoSuchAlgorithmException;

import com.sun.codec.RipeMDCoder;

public class TestRipeMD {
	public static void main(String[] args) {
		String data = "asdasd";
		System.out.println("raw data:" + data);

		try {
			// RipeMD128
			String encodedString = RipeMDCoder.encodeRipeMD(data.getBytes(),
					RipeMDCoder.RipeMD128);
			TestUtil.sysOP(RipeMDCoder.RipeMD128, encodedString);

			// RipeMD160
			encodedString = RipeMDCoder.encodeRipeMD(data.getBytes(),
					RipeMDCoder.RipeMD160);
			TestUtil.sysOP(RipeMDCoder.RipeMD160, encodedString);

			// RipeMD256
			encodedString = RipeMDCoder.encodeRipeMD(data.getBytes(),
					RipeMDCoder.RipeMD256);
			TestUtil.sysOP(RipeMDCoder.RipeMD256, encodedString);

			// RipeMD320
			encodedString = RipeMDCoder.encodeRipeMD(data.getBytes(),
					RipeMDCoder.RipeMD320);
			TestUtil.sysOP(RipeMDCoder.RipeMD320, encodedString);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

	}

}
