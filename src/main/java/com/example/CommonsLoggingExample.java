package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingExample {
	
	static Log log = LogFactory.getLog(CommonsLoggingExample.class);
	static Logger log2 = Logger.getLogger(CommonsLoggingExample.class.getName());
	
	public static void main(String[] args) {
		
		
		
		log2.log(Level.INFO,"JAVA standard logger...." );
	
		
		
		log.trace("Commons 1. TRACE level log");
		log.debug("Commons 2. DEBUG level log");
		log.info("Commons  3. INFO level log");   // info 레벨까지만 아래에 나오도록 설정되어있어서그렇다.
		log.warn("Commons  4. WARN level log");
		log.error("Commons 5. ERROR level log");
		log.fatal("Commons 6. FATAL level log");
		
		log.info("##################################");

	}   // log 찍는이유는 문제발생시 이유를 파악하기위해서다. 
		// log 는 다른데에다가 토스한다.

}
