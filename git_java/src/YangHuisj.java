public class YangHuisj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int[10][10];
		
		for(int x=0;x<arr.length;x++){
			arr [x][0] = 1;
			arr [x][x] = 1;
		}
		
		for (int x=2;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
				arr [x][y] = arr[x-1][y-1] + arr[x-1][y] ;
			}
		}
		//bian li er wei shu zu;
		/*
		for (int x=0 ;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
		*/
		//jiu jiu chengfa biao wenti ¼õ°ëÎÊÌâ
		
		for (int x=0 ;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}	
	}
}
