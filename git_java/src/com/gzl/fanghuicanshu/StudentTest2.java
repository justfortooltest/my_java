package com.gzl.fanghuicanshu;

class Student {
	public void study(){
		System.out.println("good good studey day day up");
		
	}
	
}

class StudentDemo{
	public Student getStudent(){
		
		return new Student();
	}
}
public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo sd = new StudentDemo();
		Student s = sd.getStudent();
		s.study();
	}

}
