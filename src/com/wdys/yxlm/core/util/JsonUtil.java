package com.wdys.yxlm.core.util;

import java.util.HashMap;
import java.util.Map;

public class JsonUtil {
	public static String RESULT_SUCCESS="success";
	public static String RESULT_MESSAGE="message";
	public static Map<String,Object> getResult(String message,boolean success ){
		Map<String,Object> result = new HashMap<String, Object>();
		result.put(RESULT_MESSAGE, message);
		result.put(RESULT_SUCCESS, success);
		return result; 
		
	}
}
