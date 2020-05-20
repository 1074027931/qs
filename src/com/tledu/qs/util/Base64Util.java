package com.tledu.qs.util;

import java.io.UnsupportedEncodingException;

public class Base64Util {

	// 编码
	public static String encode(String input)
			throws UnsupportedEncodingException {
		return Base64.getEncoder().encodeToString(input.getBytes("utf-8"));
	}

	// 解码
	public static String decode(String baseValue)
			throws UnsupportedEncodingException {
		return new String(Base64.getDecoder().decode(baseValue), "utf-8");
	}
}
