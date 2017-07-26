/*********************************************************************
 * 
 * Project Name:qrcode-management
 * File Name:JsonUtil.java
 * Package Name:com.greatdata.bigdata.qrcode.utils
 * Date:2016年8月15日上午11:00:34
 * Company:greatedata.com
 * @Copyright: 2016 www.greatedata.com Inc. All rights reserved.
 *
 *********************************************************************
 */
package com.example.swagger.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ClassName: JsonUtil <br/>
 * Discribe: TODO <br/>
 * Date: 2017年7月25日 上午11:00:34 <br/>
 *
 * @author	by
 * @version 
 */
public class JsonUtil {
	
	private static ObjectMapper om = new ObjectMapper();
	
	public static String object2JsonStr(Object o) throws JsonProcessingException{
		return om.writeValueAsString(o);
	}

}
