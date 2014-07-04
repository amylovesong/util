package com.sun.codec;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

/**
 * Base64 util class based on Commons Codec API
 * 
 * @author sxl
 * 
 */
public class Base64CoderCC {
	private final static String ENCODING = "UTF-8";

	// ����
	public static String encode(String data)
			throws UnsupportedEncodingException {
		byte[] b = Base64.encodeBase64(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}

	// ���ܣ���ѭRFC��׼
	public static String encodeSafe(String data)
			throws UnsupportedEncodingException {
		byte[] b = Base64.encodeBase64(data.getBytes(ENCODING), true);
		return new String(b, ENCODING);
	}

	// ����
	public static String decode(String data)
			throws UnsupportedEncodingException {
		byte[] b = Base64.decodeBase64(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}
}
