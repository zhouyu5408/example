package com.example.spring_boot_starter_hello.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hello.service")
public class HelloServiceProperties {
	public static final String MSG = "world";

	private String msg = MSG;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
