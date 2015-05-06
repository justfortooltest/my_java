package com.gzl.day0505;


public class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	// @Override
	// public String toString() {
	// // return super.toString();
	// // return "hello";
	// return "����:" + name + ",����:" + age;
	// }
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s =(Student)obj;
		if(this.name.equals(s.name) && this.age ==s.age){
			return true;
		}else {
			return false;
		}
	}
}
