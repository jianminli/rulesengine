package com.jml.rules.engine.entity;

public class Application {

	private String name;
	private int age;
	private Gender gender;
	private Result result;
	
	public Application(String name, int age, Gender gender, Result result) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.result = result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Application [name=" + name + ", age=" + age + ", gender=" + gender + ", result=" + result + "]";
	}
	
	
	
}
