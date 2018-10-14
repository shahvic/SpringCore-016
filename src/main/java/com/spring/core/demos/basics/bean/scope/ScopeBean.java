package com.spring.core.demos.basics.bean.scope;

public class ScopeBean {
	
	public String getScopeName() {
		return scopeName;
	}

	public void setScopeName(String scopeName) {
		this.scopeName = scopeName;
	}

	String scopeName;

	public void scopeBeantask() {
		System.out.println("i am doing task- scope bean object");
	}
	
}
