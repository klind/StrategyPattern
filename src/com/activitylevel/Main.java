package com.activitylevel;

import java.util.ArrayList;
import java.util.List;

import com.activitylevel.activity.ActivityLevelHigh;
import com.activitylevel.activity.ActivityLevelLow;
import com.activitylevel.activity.ActivityLevelMedium;
import com.activitylevel.person.Adult;
import com.activitylevel.person.Kid;
import com.activitylevel.person.Person;
import com.activitylevel.person.Senior;
import com.activitylevel.person.Teenager;

public class Main {

	public static void main(String[] args) {

		Person kid = new Kid("Susan", (short) 5, new ActivityLevelHigh());
		Person teen = new Teenager("Peter", (short) 15, new ActivityLevelHigh());
		Person adult = new Adult("Kurt", (short) 35, new ActivityLevelMedium());
		Person senior = new Senior("Lauren", (short) 75, new ActivityLevelLow());

		List<Person> persons = new ArrayList<>();
		persons.add(kid);
		persons.add(teen);
		persons.add(adult);
		persons.add(senior);

		for (Person p : persons) {
			short age = p.getAge();
			if (age < 13) {
				System.out.println(p.getName() + ": I am very active");
			} else if (age < 20) {
				System.out.println(p.getName() + ": I am very active");
			} else if (age < 60) {
				System.out.println(p.getName() + ": I am kind of active");
			} else {
				System.out.println(p.getName() + ": I am not very active");
			}
		}

		persons.forEach(p -> System.out.println(p.getName() + ": " + p.getMyActivityLevel()));

	}

}
