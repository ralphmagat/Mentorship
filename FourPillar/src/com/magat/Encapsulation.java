package com.magat;

import java.util.ArrayList;
import java.util.List;

public class Encapsulation {

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


	public static void main(String[] args) {

		Encapsulation enc = new Encapsulation();
		List<String> skillSet = new ArrayList();
		
		//Set the names
		enc.setFirstName("Jack");
		enc.setLastName("Cole");
		
		//will add the skills on the arraylist
		skillSet.add("Java");
		skillSet.add("MasterWalker");
		skillSet.add("WeChatMaster");
		
		//set the skills to arrays
		enc.setSkillList(skillSet);
		
		System.out.println("Employee: " + enc.getFirstName() +" " + enc.getLastName());
		System.out.println("Skills: " + skillSet);
		
		
		Encapsulation enc1 = new Encapsulation();
		List<String> skillSet1 = new ArrayList();
		
		//Set the names
		enc1.setFirstName("William");
		enc1.setLastName("Ong");
		
		//will add the skills on the arraylist
		skillSet1.add("Casino");
		skillSet1.add("Abono");
		skillSet1.add("Advance Pay");
		
		//set the skills to array
		enc.setSkillList(skillSet1);
		
		System.out.println("Employee: " + enc1.getFirstName() +" " + enc1.getLastName());
		System.out.println("Skills: " + skillSet1);
		
	
	}

}
