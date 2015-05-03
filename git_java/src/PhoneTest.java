class Phone{
	private String brand;
	private int price;
	private String color;
	
	public static String network = "cdm2000";
	
	public Phone(){
		System.out.println("this is 我的 构造方法");
	}
	
	public String getBrand(){
		return brand;
	}
	public int getPrice(){
		return price;
	} 
	public String getColor(){
		return color;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public void show(){
		System.out.println(this.brand);
		System.out.println(price);
		System.out.println(this.color);
	}
	
}
public class PhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,333};
		Phone p = new  Phone();
		System.out.println(Phone.network);
//		p.setBrand("xiaomi");
//		p.setColor("red");
//		p.setPrice(1999);
//		p.show();
		
		
		ArrayTools.printArray(arr);
		int max = ArrayTools.getMax(arr);
		System.out.println("max:"+max);
	}
	

}
