import javax.naming.spi.Resolver;


public class Array_test {
	public static void main(String[] args){
		
		int[] arr={1,2,3,5,55};
		//arr = null;
		System.out.println(arr[3]);
		
		for(int x=0;x<arr.length;x++){	
		System.out.println(arr[x]);
		}
		
		int[] arr2 = {3,4,5,66,2,44,5234,2,333,44,55};
		
		printArray(arr2);
		System.out.println("arr is no reverse###############");
		reverse(arr2);
		printArray(arr2);
		System.out.println("####################");
		System.out.println(getIndex(arr2, 44));
	}
	
	public static void printArray(int[] arr) {
		for(int x=0;x<arr.length;x++){	
			System.out.println(arr[x]);
	}
	
   }
	
	public static void reverse(int[] arr){
		
		for(int x=0;x<arr.length/2;x++){
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
			
		}
	}
	
	public static int getIndex(int[] arr,int value){
		for(int x=0;x<arr.length;x++){
			if(arr[x] == value){
				return x;
			}
		
			
		}
		return -1;
		
	}
	
	
}
