package com.magat;

import java.util.ArrayList;
import java.util.List;

public class Output {
	
	
	public void getPerson (String firstName, String lastName) {
		
		Encapsulation enc = new Encapsulation();
		List <String> skillList =  new ArrayList<>();
		skillList.add("Java");
		skillList.add("Walker");
		enc.setSkillList(skillList);
		
		firstName = enc.getFirstName();
		lastName = enc.getLastName();
		
		System.out.println("Person name: " + firstName + lastName);
		System.out.println("Skillset: " + skillList);
	}
	
	
	public static void main(String[] args) {
		
		Output out = new Output();
		out.getPerson("Jack", "Cole");
		
}
}
