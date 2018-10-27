package com.spring.core.demos.basics.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component("aopfunctions")
public class AOPFunctions {
	// total 4 join points
public void doSum() {
	System.out.println("do sum functions being executed");
}

public void doMul() {
	System.out.println("do mul function");
}

}
