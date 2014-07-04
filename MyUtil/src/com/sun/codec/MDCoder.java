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
	 * MD2���ܣ�java�ṩ��MD2�㷨Ӧ�ã�
	 * 
	 * @param data
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String encodeMD2(byte[] data) throws NoSuchAlgorithmException {
		// ��ʼ��MessageDigest
		MessageDigest md = MessageDigest.getInstance("MD2");
		// ִ��ժҪ��Ϣ
		byte[] digest = md.digest(data);
		// ��ժҪ��Ϣת��Ϊ32λ��ʮ�������ַ���
		return new String(new HexBinaryAdapter().marshal(digest));
	}

	/**
	 * MD5���ܣ�java�ṩ��MD5�㷨Ӧ�ã�
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
	 * MD4���ܣ�BouncyCastle�����MD4�㷨��Ӧ�ã�
	 * 
	 * @param data
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String encodeMD4(byte[] data) throws NoSuchAlgorithmException {
		// ����Bouncy Castle��֧��
		Security.addProvider(new BouncyCastleProvider());
		MessageDigest md = MessageDigest.getInstance("MD4");
		byte[] digest = md.digest(data);
		// ��ժҪ��Ϣת��Ϊ32λ��ʮ�������ַ���
		return new String(Hex.encode(digest));
	}

	// Commons Codec�ṩ����ϢժҪ�Ĺ�����-----DigestUtils�ࡣ
	// DigestUtils���Ƕ�Sun�ṩ��MessageDigest���һ�η�װ���ṩ��MD5��SHAϵ����ϢժҪ�㷨��ʵ�֡�
	/**
	 * MD5���� ����ʮ�����Ƶ��ַ���
	 * 
	 * @param data
	 * @return
	 */
	public static String encodeMD5Hex(byte[] data) {
		return DigestUtils.md5Hex(data);
	}

	/**
	 * MD5���� ����ʮ���Ƶ��ֽ�����
	 * 
	 * @param data
	 * @return
	 */
	public static byte[] encodeMD5Decimalism(byte[] data) {
		return DigestUtils.md5(data);
	}
}
