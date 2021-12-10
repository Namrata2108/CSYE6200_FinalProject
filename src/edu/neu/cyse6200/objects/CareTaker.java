package edu.neu.cyse6200.objects;

import java.util.List;

public class CareTaker {
	
	private String name;
	private List<Student> childList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getChildList() {
		return childList;
	}
	public void setChildList(List<Student> childList) {
		this.childList = childList;
	}
	
}
