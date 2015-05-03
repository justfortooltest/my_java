import java.util.Scanner;

class FunctionTest3{
   public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("plese input one:");
        int a = sc.nextInt();
        
        //Scanner sc = new Scanner(System.in);
        System.out.println("plese input two:");
        int b = sc.nextInt();
        
       // Scanner sc = new Scanner(System.in);
        System.out.println("plese input three:");
        int c = sc.nextInt();
        
        int max = getMax(a,b,c);
        System.out.println("san ge zhong zui da shi"+max);
        
   
        
   
   }
   
   public static int getMax(int a,int b,int c){
       if(a>b){
           if(a>c){
               return a;
           }else{
               return c;
           }
       }else{
           if(b>c){
               return b;
           }else{
               return c;
           }
       }
   }

}