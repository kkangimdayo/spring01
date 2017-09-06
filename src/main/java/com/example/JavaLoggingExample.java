package com.example;

import java.util.logging.Logger;

public class JavaLoggingExample {

	static Logger log = Logger.getLogger(JavaLoggingExample.class.getName()); // 로거를 가져오는것이다. 나를대신해서 로거를 찍을애다.
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello Sysout logging/...");
    
		log.info("hello java 내장 로그 출력 ...");
	}

}
