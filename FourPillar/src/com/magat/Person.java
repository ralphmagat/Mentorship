package com.magat;

import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private List<String> skillList;
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public List<String> getSkillList() {
		return skillList;
	}


	public void setSkillList(List<String> skillList) {
		this.skillList = skillList;
	}

}
