class Student {
	String name;
	int age;
	
	private int num = 10;
	
	private void pmethod() {
		System.out.println("this is private method");
	}
	public void function(){
		pmethod();
		
	}
	public void setAge(int a){
		if(a<0 || a>120){
			System.out.println("age is illega");
		}else{
			age=a;
		}
	}
	public void show(){
		System.out.println("i love student");
		System.out.println("–’√˚:"+name);
		System.out.println("ƒÍ¡‰"+age);
	}
	
	
}


public class NoNameDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();

		s.setAge(270);
		s.name="gzl";
		s.show();
		s.function();
		//s.pmethod();
		//System.out.println(s.num);
	
		
		
	}

}
