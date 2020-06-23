package com.hq.utils;

import java.util.UUID;

/**
 * 获取 随机的uuid  id
 * @author zhangjie
 *
 */
public class UUIDUtils {
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}

}
