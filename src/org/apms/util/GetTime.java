package org.apms.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 *@author lwxyz
 *@version 2015年4月15日 下午9:56:32
 *
 *获取当前时间的工具类
 */

public class GetTime {
	public static String getTime(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String time = df.format(new Date());// new Date()为获取当前系统时间
		return time;
	}
}
