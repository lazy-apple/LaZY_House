package com.lazy.house.common.utils;

import java.nio.charset.Charset;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class HashUtils {
	
	private static final HashFunction FUNCTION = Hashing.md5();
	
	private static final String SALT = "lazy.com";//盐：防止用户密码简单被破解
	
	public static String encryPassword(String password){
	   HashCode hashCode =	FUNCTION.hashString(password+SALT, Charset.forName("UTF-8"));
	   return hashCode.toString();
	}

}
