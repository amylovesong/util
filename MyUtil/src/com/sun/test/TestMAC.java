package com.sun.test;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import com.sun.codec.MACCoder;

public class TestMAC {
	public static void main(String[] args) {
		String data = "asdfgh";
		System.out.println("raw data:" + data);

		// Java本身实现的MAC算法
		// try {
		// // HmacMD5
		// byte[] keyHmacMD5 = MACCoder.initHmacMD5Key();
		// String encodedString = MACCoder.encodeHmacMD5(data.getBytes(),
		// keyHmacMD5);
		// TestUtil.sysOP(MACCoder.HmacMD5, keyHmacMD5, encodedString);
		//
		// // HmacSHA1
		// byte[] keyHmacSHA1 = MACCoder.initHmacSHAKey();
		// encodedString = MACCoder
		// .encodeHmacSHA(data.getBytes(), keyHmacSHA1);
		// TestUtil.sysOP(MACCoder.HmacSHA1, keyHmacSHA1, encodedString);
		//
		// // HmacSHA256
		// byte[] keyHmacSHA256 = MACCoder.initHmacSHA256Key();
		// // byte[] keyHmacSHA256 = keyHmacMD5;
		// encodedString = MACCoder.encodeHmacSHA256(data.getBytes(),
		// keyHmacSHA256);
		// TestUtil.sysOP(MACCoder.HmacSHA256, keyHmacSHA256, encodedString);
		//
		// // HmacSHA384
		// byte[] keyHmacSHA384 = MACCoder.initHmacSHA384Key();
		// encodedString = MACCoder.encodeHmacSHA384(data.getBytes(),
		// keyHmacSHA384);
		// TestUtil.sysOP(MACCoder.HmacSHA384, keyHmacSHA384, encodedString);
		//
		// // HmacSHA512
		// byte[] keyHmacSHA512 = MACCoder.initHmacSHA512Key();
		// encodedString = MACCoder.encodeHmacSHA512(data.getBytes(),
		// keyHmacSHA512);
		// TestUtil.sysOP(MACCoder.HmacSHA512, keyHmacSHA512, encodedString);
		// } catch (NoSuchAlgorithmException e) {
		// e.printStackTrace();
		// } catch (InvalidKeyException e) {
		// e.printStackTrace();
		// }

		// 第三方加密组件BouncyCastle提供的MAC算法
		try {
			// HmacMD2
			byte[] keyHmacMD2 = MACCoder.initHmacMD2Key();
			String encodedString = MACCoder.encodeHmacMD2(data.getBytes(),
					keyHmacMD2);
			TestUtil.sysOP(MACCoder.HmacMD2, keyHmacMD2, encodedString);

			// HmacMD4
			byte[] keyHmacMD4 = MACCoder.initHmacMD4Key();
			encodedString = MACCoder.encodeHmacMD4(data.getBytes(), keyHmacMD4);
			TestUtil.sysOP(MACCoder.HmacMD4, keyHmacMD4, encodedString);

			// HmacSHA224
			byte[] keySHA224 = MACCoder.initHmacSHA224Key();
			encodedString = MACCoder.encodeHmacSHA224(data.getBytes(),
					keySHA224);
			TestUtil.sysOP(MACCoder.HmacSHA224, keySHA224, encodedString);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		}
	}
}
