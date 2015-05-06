package com.gzl.jcjk;

public class Cat extends Animal implements Jump {

	@Override
	public void jump1() {
		// TODO Auto-generated method stub
		System.out.println("cat is jump1");

	}

	@Override
	public void jump2() {
		// TODO Auto-generated method stub
		System.out.println("cat is jump2");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("cat eat fish");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("cat is sleep");

	}
	

	public void zls(){
		System.out.println("linux z l s");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.jump1();
		c.jump2();
		c.eat();
		c.sleep();
	}

}
