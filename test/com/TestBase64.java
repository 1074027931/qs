package com;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class TestBase64 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String location = "内蒙古包头市 联通";
		// 编码
		String encodingValue = Base64.getEncoder().encodeToString(location.getBytes("utf-8"));
		System.out.println(encodingValue);
		
		// 解码
		String resultValue = new String(Base64.getDecoder().decode(encodingValue),"utf-8");
		System.out.println(resultValue);
	}
}
