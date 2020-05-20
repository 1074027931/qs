package com;

import com.tledu.qs.util.RegexUtil;

/**
 * 正则表达式
 * 
 * Pattern 和 Matcher
 * 
 * Pattern : java中正则表达式引擎
 * 
 * Matcher : 匹配器
 * 
 * @author 天亮教育-帅气多汁你泽哥
 * @Date 2020年5月18日
 */
public class TestRegex_03 {
	public static void main(String[] args) {

		String ip = "255.255.255.265";
		System.out.println(RegexUtil.isValidIP(ip));

	}
}
