package com.sun.codec;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class MACCoder {
	public static final String HmacMD5 = "HmacMD5";
	public static final String HmacSHA1 = "HmacSHA1";
	public static final String HmacSHA256 = "HmacSHA256";
	public static final String HmacSHA384 = "HmacSHA384";
	public static final String HmacSHA512 = "HmacSHA512";

	public static final String HmacMD2 = "HmacMD2";
	public static final String HmacMD4 = "HmacMD4";
	public static final String HmacSHA224 = "HmacSHA224";

	// Java实现，包括HmacMD5、HmacSHA1、HmacSHA256、HmacSHA384和HmacSHA512
	/**
	 * 产生HmacMD5摘要算法的密钥
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacMD5Key() throws NoSuchAlgorithmException {
		// 初始化密钥产生器
		KeyGenerator generator = KeyGenerator.getInstance(HmacMD5);
		// 产生密钥
		SecretKey secretKey = generator.generateKey();
		// 获得密钥
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacMD5摘要算法
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacMD5(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		// 还原密钥
		SecretKey secretKey = new SecretKeySpec(key, HmacMD5);
		// 实例化Mac
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		// 初始化mac
		mac.init(secretKey);
		// 执行消息摘要
		byte[] digest = mac.doFinal(data);
		// 将字节数组转为十六进制的字符串
		return new HexBinaryAdapter().marshal(digest);
	}

	/**
	 * 产生HmacSHA1的密钥
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacSHAKey() throws NoSuchAlgorithmException {
		KeyGenerator generator = KeyGenerator.getInstance(HmacSHA1);
		SecretKey secretKey = generator.generateKey();
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacSHA1加密
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacSHA(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		SecretKey secretKey = new SecretKeySpec(key, HmacSHA1);
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);
		byte[] digest = mac.doFinal(data);
		return new HexBinaryAdapter().marshal(digest);
	}

	/**
	 * 产生HmacSHA256的密钥
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacSHA256Key() throws NoSuchAlgorithmException {
		KeyGenerator generator = KeyGenerator.getInstance(HmacSHA256);
		SecretKey secretKey = generator.generateKey();
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacSHA256加密
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacSHA256(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		SecretKey secretKey = new SecretKeySpec(key, HmacSHA256);
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);
		byte[] digest = mac.doFinal(data);
		return new HexBinaryAdapter().marshal(digest);
	}

	/**
	 * 产生HmacSHA384的密钥
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacSHA384Key() throws NoSuchAlgorithmException {
		KeyGenerator generator = KeyGenerator.getInstance(HmacSHA384);
		SecretKey secretKey = generator.generateKey();
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacSHA384加密
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacSHA384(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		SecretKey secretKey = new SecretKeySpec(key, HmacSHA384);
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);
		byte[] digest = mac.doFinal(data);
		return new HexBinaryAdapter().marshal(digest);
	}

	/**
	 * 产生HmacSHA512的密钥
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacSHA512Key() throws NoSuchAlgorithmException {
		KeyGenerator generator = KeyGenerator.getInstance(HmacSHA512);
		SecretKey secretKey = generator.generateKey();
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacSHA512加密
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacSHA512(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		SecretKey secretKey = new SecretKeySpec(key, HmacSHA512);
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);
		byte[] digest = mac.doFinal(data);
		return new HexBinaryAdapter().marshal(digest);
	}

	// 以下是由第三方加密组件包Bouncy Castle提供的HmacMD2、HmacMD4、HmacSHA224
	/**
	 * 产生HmacMD2的密钥
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacMD2Key() throws NoSuchAlgorithmException {
		// 初始化密钥生成器。这里需要BouncyCastle的支持
		KeyGenerator generator = KeyGenerator.getInstance(HmacMD2,
				new BouncyCastleProvider());
		// 产生密钥
		SecretKey secretKey = generator.generateKey();
		// 获得密钥
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacMD2加密
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacMD2(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		// 还原密钥
		SecretKey secretKey = new SecretKeySpec(key, HmacMD2);
		// 实例化Mac。这里需要BouncyCastle的支持
		Mac mac = Mac.getInstance(secretKey.getAlgorithm(),
				new BouncyCastleProvider());
		// 初始化
		mac.init(secretKey);
		// 执行消息摘要
		byte[] digest = mac.doFinal(data);
		// 将字节数组转化为十六进制字符串
		return new HexBinaryAdapter().marshal(digest);
	}

	/**
	 * 产生HmacMD4的密钥
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacMD4Key() throws NoSuchAlgorithmException {
		// 需要BouncyCastle的支持
		Security.addProvider(new BouncyCastleProvider());
		KeyGenerator generator = KeyGenerator.getInstance(HmacMD4);
		SecretKey secretKey = generator.generateKey();
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacMD4加密
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacMD4(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		// !!别忘了第三方加密组件BouncyCastle的支持
		Security.addProvider(new BouncyCastleProvider());
		SecretKey secretKey = new SecretKeySpec(key, HmacMD4);
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		// Mac mac = Mac.getInstance(HmacMD4);
		mac.init(secretKey);
		byte[] digest = mac.doFinal(data);
		return new HexBinaryAdapter().marshal(digest);
	}

	/**
	 * 产生HmacSHA224的密钥
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacSHA224Key() throws NoSuchAlgorithmException {
		Security.addProvider(new BouncyCastleProvider());
		KeyGenerator generator = KeyGenerator.getInstance(HmacSHA224);
		SecretKey secretKey = generator.generateKey();
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacSHA224加密
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacSHA224(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		Security.addProvider(new BouncyCastleProvider());
		SecretKey secretKey = new SecretKeySpec(key, HmacSHA224);
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);
		byte[] digest = mac.doFinal(data);
		return new HexBinaryAdapter().marshal(digest);
	}
}
