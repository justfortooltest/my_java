package com.gzl.abstracttest;

abstract class Animal{
//	public abstract void eat(){};
	public abstract void eat();
}

abstract class Dog extends Animal{}

class Cat extends Animal {
	public void eat(){
		System.out.println("cat eat fish");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Cat();
		a.eat();
		
	}

}
