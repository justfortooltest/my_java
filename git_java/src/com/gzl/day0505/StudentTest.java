package com.gzl.day0505;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student("gzl",24);
		Student s1= new Student("gcl",23);
		Student s3 = new Student("gzl",24);
		
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s3));
	}

}
