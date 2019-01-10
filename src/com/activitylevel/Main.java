package com.activitylevel;

import java.util.ArrayList;
import java.util.List;

import com.activitylevel.activity.ActivityLevelHigh;
import com.activitylevel.activity.ActivityLevelLow;
import com.activitylevel.activity.ActivityLevelMedium;
import com.activitylevel.activity.ActivityLevelNone;
import com.activitylevel.person.Adult;
import com.activitylevel.person.Dead;
import com.activitylevel.person.Kid;
import com.activitylevel.person.Person;
import com.activitylevel.person.Senior;
import com.activitylevel.person.Teenager;

public class Main {

	public static void main(String[] args) {

		Person susan = new Kid("Susan", (short) 5, new ActivityLevelHigh());
		Person peter = new Teenager("Peter", (short) 15, new ActivityLevelHigh());
		Person kurt = new Adult("Kurt", (short) 35, new ActivityLevelMedium());
		Person lauren = new Senior("Lauren", (short) 75, new ActivityLevelLow());
		Person brian = new Dead("Brian", (short) -1, new ActivityLevelNone());

		List<Person> persons = new ArrayList<>();
		persons.add(susan);
		persons.add(peter);
		persons.add(kurt);
		persons.add(lauren);
		persons.add(brian);

		// We want to avoid many conditional if's etc.
		for (Person p : persons) {
			short age = p.getAge();
			if (age < 0) {
				System.out.println(p.getName() + ": I am dead");
			} else if (age < 13) {
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
