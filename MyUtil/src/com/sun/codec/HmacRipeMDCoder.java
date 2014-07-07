package com.sun.codec;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

public class HmacRipeMDCoder {
	public static final String HmacRipeMD128 = "HmacRipeMD128";
	public static final String HmacRipeMD160 = "HmacRipeMD160";

	/**
	 * 产生HmacRipeMD的密钥
	 * 
	 * @param algorithm
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacRipeMDKey(String algorithm)
			throws NoSuchAlgorithmException {
		Security.addProvider(new BouncyCastleProvider());
		KeyGenerator generator = KeyGenerator.getInstance(algorithm);
		SecretKey secretKey = generator.generateKey();
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacRipeMD加密
	 * 
	 * @param data
	 * @param key
	 * @param algorithm
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacRipeMD(byte[] data, byte[] key,
			String algorithm) throws NoSuchAlgorithmException,
			InvalidKeyException {
		Security.addProvider(new BouncyCastleProvider());
		SecretKey secretKey = new SecretKeySpec(key, algorithm);
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);
		byte[] digest = mac.doFinal(data);
		// return new HexBinaryAdapter().marshal(digest);
		return new String(Hex.encode(digest));
	}
}
