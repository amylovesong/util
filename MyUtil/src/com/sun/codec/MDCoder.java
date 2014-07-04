package com.sun.codec;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

/**
 * MD util
 * 
 * @author sxl
 * 
 */
public class MDCoder {
	/**
	 * MD2加密（java提供的MD2算法应用）
	 * 
	 * @param data
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String encodeMD2(byte[] data) throws NoSuchAlgorithmException {
		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("MD2");
		// 执行摘要信息
		byte[] digest = md.digest(data);
		// 将摘要信息转换为32位的十六进制字符串
		return new String(new HexBinaryAdapter().marshal(digest));
	}

	/**
	 * MD5加密（java提供的MD5算法应用）
	 * 
	 * @param data
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String encodeMD5(byte[] data) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] digest = md.digest(data);
		return new String(new HexBinaryAdapter().marshal(digest));
	}

	/**
	 * MD4加密（BouncyCastle补充的MD4算法的应用）
	 * 
	 * @param data
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String encodeMD4(byte[] data) throws NoSuchAlgorithmException {
		// 加入Bouncy Castle的支持
		Security.addProvider(new BouncyCastleProvider());
		MessageDigest md = MessageDigest.getInstance("MD4");
		byte[] digest = md.digest(data);
		// 将摘要信息转换为32位的十六进制字符串
		return new String(Hex.encode(digest));
	}

	// Commons Codec提供了消息摘要的工具类-----DigestUtils类。
	// DigestUtils类是对Sun提供的MessageDigest类的一次封装，提供了MD5和SHA系列消息摘要算法的实现。
	/**
	 * MD5加密 返回十六进制的字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String encodeMD5Hex(byte[] data) {
		return DigestUtils.md5Hex(data);
	}

	/**
	 * MD5加密 返回十进制的字节数组
	 * 
	 * @param data
	 * @return
	 */
	public static byte[] encodeMD5Decimalism(byte[] data) {
		return DigestUtils.md5(data);
	}
}
