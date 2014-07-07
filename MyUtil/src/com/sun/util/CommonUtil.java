package com.sun.util;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class CommonUtil {
	/**
	 * 将字节数组转换为十六进制的字符串
	 * 
	 * @param bytes
	 * @return
	 */
	public static String convertBytes2HexString(byte[] bytes) {
		return new HexBinaryAdapter().marshal(bytes);
	}
}
