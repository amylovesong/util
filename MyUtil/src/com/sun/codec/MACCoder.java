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

	// Javaʵ�֣�����HmacMD5��HmacSHA1��HmacSHA256��HmacSHA384��HmacSHA512
	/**
	 * ����HmacMD5ժҪ�㷨����Կ
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacMD5Key() throws NoSuchAlgorithmException {
		// ��ʼ����Կ������
		KeyGenerator generator = KeyGenerator.getInstance(HmacMD5);
		// ������Կ
		SecretKey secretKey = generator.generateKey();
		// �����Կ
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacMD5ժҪ�㷨
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacMD5(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		// ��ԭ��Կ
		SecretKey secretKey = new SecretKeySpec(key, HmacMD5);
		// ʵ����Mac
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		// ��ʼ��mac
		mac.init(secretKey);
		// ִ����ϢժҪ
		byte[] digest = mac.doFinal(data);
		// ���ֽ�����תΪʮ�����Ƶ��ַ���
		return new HexBinaryAdapter().marshal(digest);
	}

	/**
	 * ����HmacSHA1����Կ
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
	 * HmacSHA1����
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
	 * ����HmacSHA256����Կ
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
	 * HmacSHA256����
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
	 * ����HmacSHA384����Կ
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
	 * HmacSHA384����
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
	 * ����HmacSHA512����Կ
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
	 * HmacSHA512����
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

	// �������ɵ��������������Bouncy Castle�ṩ��HmacMD2��HmacMD4��HmacSHA224
	/**
	 * ����HmacMD2����Կ
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacMD2Key() throws NoSuchAlgorithmException {
		// ��ʼ����Կ��������������ҪBouncyCastle��֧��
		KeyGenerator generator = KeyGenerator.getInstance(HmacMD2,
				new BouncyCastleProvider());
		// ������Կ
		SecretKey secretKey = generator.generateKey();
		// �����Կ
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacMD2����
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacMD2(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		// ��ԭ��Կ
		SecretKey secretKey = new SecretKeySpec(key, HmacMD2);
		// ʵ����Mac��������ҪBouncyCastle��֧��
		Mac mac = Mac.getInstance(secretKey.getAlgorithm(),
				new BouncyCastleProvider());
		// ��ʼ��
		mac.init(secretKey);
		// ִ����ϢժҪ
		byte[] digest = mac.doFinal(data);
		// ���ֽ�����ת��Ϊʮ�������ַ���
		return new HexBinaryAdapter().marshal(digest);
	}

	/**
	 * ����HmacMD4����Կ
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] initHmacMD4Key() throws NoSuchAlgorithmException {
		// ��ҪBouncyCastle��֧��
		Security.addProvider(new BouncyCastleProvider());
		KeyGenerator generator = KeyGenerator.getInstance(HmacMD4);
		SecretKey secretKey = generator.generateKey();
		byte[] key = secretKey.getEncoded();
		return key;
	}

	/**
	 * HmacMD4����
	 * 
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encodeHmacMD4(byte[] data, byte[] key)
			throws NoSuchAlgorithmException, InvalidKeyException {
		// !!�����˵������������BouncyCastle��֧��
		Security.addProvider(new BouncyCastleProvider());
		SecretKey secretKey = new SecretKeySpec(key, HmacMD4);
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		// Mac mac = Mac.getInstance(HmacMD4);
		mac.init(secretKey);
		byte[] digest = mac.doFinal(data);
		return new HexBinaryAdapter().marshal(digest);
	}

	/**
	 * ����HmacSHA224����Կ
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
	 * HmacSHA224����
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
