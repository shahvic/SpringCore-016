package com.spring.core.demos.basics.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
	
	private String collectionBeanName;
	private List<String> collectionBeanList;
	private Set<String> collectionBeanSet;
	private Map<String,String> collectionBeanMap;
	
	
	public String getCollectionBeanName() {
		return collectionBeanName;
	}
	public void setCollectionBeanName(String collectionBeanName) {
		this.collectionBeanName = collectionBeanName;
	}
	public List<String> getCollectionBeanList() {
		return collectionBeanList;
	}
	public void setCollectionBeanList(List<String> collectionBeanList) {
		this.collectionBeanList = collectionBeanList;
	}
	public Set<String> getCollectionBeanSet() {
		return collectionBeanSet;
	}
	public void setCollectionBeanSet(Set<String> collectionBeanSet) {
		this.collectionBeanSet = collectionBeanSet;
	}
	public Map<String, String> getCollectionBeanMap() {
		return collectionBeanMap;
	}
	public void setCollectionBeanMap(Map<String, String> collectionBeanMap) {
		this.collectionBeanMap = collectionBeanMap;
	}
	
	

}
