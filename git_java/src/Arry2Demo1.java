
public class Arry2Demo1 {
	public static void main (String [] args){
		int [][] arr = {{1,2,3},{11,22,33}};
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[1][0]);
		
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				System.out.println(arr[x][y]+"");
			}
		}
		
		
	}
}
