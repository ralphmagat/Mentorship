package com.magat;

import java.util.List;

public class Diplay {
	
	public void displayOnScreenByName(String firstName, List<Person> personList) {
			
//		for(Person person: personList) {
//			
//			if (firstName != null && firstName.equalsIgnoreCase(person.getFirstName())){
//		
//				System.out.println(person.getFirstName());
//				System.out.println(person.getLastName());
//				System.out.println(person.getSkillList());
//				
//			}
//			
//			
//		}
		
		for (int i=0; i< personList.size(); i++) {
			
			System.out.println(personList.get(i).getFirstName());
			
		}
		
	}
	
	
}
