package com.sun.codec;

import java.io.UnsupportedEncodingException;

import org.bouncycastle.util.encoders.UrlBase64;

/**
 * UrlBase64 util class based on Bouncy Castle API
 * 
 * @author sxl
 * 
 */
public class UrlBase64Coder {
	public static final String ENCODING = "UTF-8";

	// º”√‹
	public static String encode(String data)
			throws UnsupportedEncodingException {
		byte[] b = UrlBase64.encode(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}

	// Ω‚√‹
	public static String decode(String data)
			throws UnsupportedEncodingException {
		byte[] b = UrlBase64.decode(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}
}
