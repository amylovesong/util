package com.sun.codec;

import java.io.UnsupportedEncodingException;

import org.bouncycastle.util.encoders.Base64;

/**
 * Base64 util class based on Bouncy Castle API
 * 
 * @author sxl
 * 
 */
public class Base64Coder {
	private final static String ENCODING = "UTF-8";

	// º”√‹
	public static String encode(String data)
			throws UnsupportedEncodingException {
		byte[] b = Base64.encode(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}

	// Ω‚√‹
	public static String decode(String data)
			throws UnsupportedEncodingException {
		byte[] b = Base64.decode(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}
}
