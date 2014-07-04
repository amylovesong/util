package com.sun.codec;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class SHACoder {
	// SHA即SHA-1的简称
	public static final String SHA_1 = "SHA";
	public static final String SHA_256 = "SHA-256";
	public static final String SHA_384 = "SHA-384";
	public static final String SHA_512 = "SHA-512";

	private static final String SHA_224 = "SHA-224";

	// ***Java实现***/
	/**
	 * SHA消息摘要算法
	 * 
	 * @param data
	 * @param algorithm
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String encodeSHA(byte[] data, String algorithm)
			throws NoSuchAlgorithmException {
		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance(algorithm);
		byte[] digest = md.digest(data);
		return new HexBinaryAdapter().marshal(digest);
	}

	// ***Bouncy Castle实现***/
	/**
	 * SHA-224消息摘要算法（需要Bouncy Castle支持）
	 * 
	 * @param data
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String encodeSHA224(byte[] data)
			throws NoSuchAlgorithmException {
		Security.addProvider(new BouncyCastleProvider());
		MessageDigest md = MessageDigest.getInstance(SHA_224);
		byte[] digest = md.digest(data);
		return new HexBinaryAdapter().marshal(digest);
	}

	// ***Commons Codec实现***/
	/**
	 * SHA-1
	 * 
	 * @param data
	 * @return 字节数组
	 */
	public static byte[] encodeSHA(byte[] data) {
		return DigestUtils.sha1(data);
	}

	/**
	 * SHA-1
	 * 
	 * @param data
	 * @return 十六进制字符串
	 */
	public static String encodeSHAHex(byte[] data) {
		return DigestUtils.sha1Hex(data);
	}

	// SHA-256
	public static byte[] encodeSHA256(byte[] data) {
		return DigestUtils.sha256(data);
	}

	public static String encodeSHA256Hex(byte[] data) {
		return DigestUtils.sha256Hex(data);
	}

	// SHA-384
	public static byte[] encodeSHA384(byte[] data) {
		return DigestUtils.sha384(data);
	}

	public static String encodeSHA384Hex(byte[] data) {
		return DigestUtils.sha384Hex(data);
	}

	// SHA-512
	public static byte[] encodeSHA512(byte[] data) {
		return DigestUtils.sha512(data);
	}

	public static String encodeSHA512Hex(byte[] data) {
		return DigestUtils.sha512Hex(data);
	}
}
