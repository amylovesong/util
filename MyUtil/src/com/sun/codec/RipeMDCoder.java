package com.sun.codec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

/**
 * RipeMD摘要算法工具类
 * 
 * @author sxl
 * 
 */
public class RipeMDCoder {
	public static final String RipeMD128 = "RipeMD128";
	public static final String RipeMD160 = "RipeMD160";
	public static final String RipeMD256 = "RipeMD256";
	public static final String RipeMD320 = "RipeMD320";

	public static String encodeRipeMD(byte[] data, String algorithm)
			throws NoSuchAlgorithmException {
		// 需要BouncyCastle的支持
		Security.addProvider(new BouncyCastleProvider());
		MessageDigest md = MessageDigest.getInstance(algorithm);
		byte[] digest = md.digest(data);
		return new String(Hex.encode(digest));
	}
}
