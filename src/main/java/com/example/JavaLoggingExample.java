package com.example;

import java.util.logging.Logger;

public class JavaLoggingExample {

	// logger : 실제 로깅을 처리하는 주체
	
	/*
	 *  JAVA에 내장된 로거 사용
	 */
	static Logger log = Logger.getLogger(JavaLoggingExample.class.getName());
	
	public static void main(String[] args) {

		System.out.println("Hello Sysout logging...");
		
		log.info("Hello Java 내장 로그 출력...");
	}

}
