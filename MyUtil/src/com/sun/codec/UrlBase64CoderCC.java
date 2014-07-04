package com.sun.codec;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

/**
 * UrlBase64 util class based on Commons Codec API
 * 
 * @author sxl
 * 
 */
public class UrlBase64CoderCC {
	public static final String ENCODING = "UTF-8";

	// º”√‹
	public static String encode(String data)
			throws UnsupportedEncodingException {
		byte[] b = Base64.encodeBase64URLSafe(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}

	// Ω‚√‹
	public static String decode(String data)
			throws UnsupportedEncodingException {
		byte[] b = Base64.decodeBase64(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}
}
