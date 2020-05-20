package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class TestRegex_01 {
	public static void main(String[] args) {
		String regexTel = "\\d{11}";
		String tel = "13113113111a";

		// 引擎
		Pattern pattern = Pattern.compile(regexTel);
		// 匹配器
		Matcher matcher = pattern.matcher(tel);

		/**
		 * 三种匹配方式
		 * 
		 * matches : 全词匹配
		 * 
		 * find : 在任意位置均可
		 * 
		 * lookingAt : 从前向后匹配
		 */
		System.out.println(matcher.matches());
		// 注意 : 一个matcher 和相应的find/matches/lookingAt 是配对的,不要使用一个matches而和别的一起连用
		// 如果一定要连用,要重新打开match而就可以
		matcher = pattern.matcher(tel);
		System.out.println(matcher.find());

		matcher = pattern.matcher(tel);
		System.out.println(matcher.lookingAt());
		/**
		 * find 和 group连用 可以取出数据
		 */
		regexTel = "(我的电话是)(\\d{11})";
		tel = "我的电话是13113113111";
		pattern = Pattern.compile(regexTel);
		matcher = pattern.matcher(tel);
		// System.out.println(matcher.find());
		if (matcher.find()) {
			System.out.println(matcher.group(0));
		}

	}
}
