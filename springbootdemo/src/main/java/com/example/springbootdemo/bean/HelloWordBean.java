package com.example.springbootdemo.bean;

public class HelloWordBean {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public HelloWordBean(String name) {
		this.msg = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("HelloWorldBean=%s", msg);
	}

}
