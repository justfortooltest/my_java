package com.gzl.xingshicanshu;



class Student {
	public void study(){
		System.out.println("good good studey day day up");
		
	}
	
}

class StudentDemo {
	public void method(Student s){
		s.study();
	}
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo sd = new StudentDemo();
		Student ss = new Student();
		sd.method(ss);
		
	}

}
