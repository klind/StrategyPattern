package com.activitylevel.person;

import com.activitylevel.activity.ActivityLevel;

public abstract class Person {
	
	private String name;
	private short age;
	private ActivityLevel activityLevel;
	
	public Person(String name, short age, ActivityLevel activityLevel) {
		super();
		this.age = age;
		this.name = name;
		this.activityLevel = activityLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ActivityLevel getActivityLevel() {
		return activityLevel;
	}

	public void setActivityLevel(ActivityLevel activityLevel) {
		this.activityLevel = activityLevel;
	}
	
	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public String getMyActivityLevel() {
		return activityLevel.getActivityLevel();
	}
}
