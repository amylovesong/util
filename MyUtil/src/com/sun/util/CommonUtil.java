package com.sun.util;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class CommonUtil {
	/**
	 * ���ֽ�����ת��Ϊʮ�����Ƶ��ַ���
	 * 
	 * @param bytes
	 * @return
	 */
	public static String convertBytes2HexString(byte[] bytes) {
		return new HexBinaryAdapter().marshal(bytes);
	}
}
