package com;

import  com.tledu.qs.util.RegexUtil;

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
public class TestRegex_02 {
	public static void main(String[] args) {

		/**
		 * find 和 group连用 可以取出数据
		 */
		String regexTel = "我的电话是(\\d{11})";
		String tel = "我的电话是13113113111";
		System.out.println(RegexUtil.isValid(regexTel, tel));
		System.out.println(RegexUtil.getMatchContent(regexTel, tel, 1));

	}
}
