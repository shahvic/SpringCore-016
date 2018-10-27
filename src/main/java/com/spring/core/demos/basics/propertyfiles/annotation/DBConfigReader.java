package com.spring.core.demos.basics.propertyfiles.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@PropertySource("dbconfig.properties")
@Component("dbconfigwithannotation")
@Configuration
@ComponentScan("")
public class DBConfigReader {
	
	@Autowired
	Environment environment;
	
	@Value("${db.host}")
	private String dbHost;

	public String getDbHost() {
		
		String data =environment.getProperty("db.host");
		System.out.println(data);
		return dbHost;
		
		
	}

	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}

}
