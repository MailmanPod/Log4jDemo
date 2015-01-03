package org.comcast.log4jDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss zZ");
		String formatDate = sdf.format(new Date());
		
		String startMsg = "Application started at: " + formatDate;
		
		Logger logger = LogManager.getLogger();
		
		logger.info(startMsg);
		logger.info("Info Message");
		logger.debug("Debug msg");
		logger.error("Corta la bocha");
		logger.info("Class: " + Log4jDemo.class.getCanonicalName());
	}
}