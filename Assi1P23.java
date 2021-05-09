import java.lang.*;
import java.util.*;
class Assi1P23{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int m = 0;
        int count = 0;
        int k = 0;
        int  sum = 0;
        int i = 0;
        
         String[] arr ={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        String brr[] = new String[10];
        while(n!=0){
            m = n%10;
            n = n/10;
            sum =sum +(int)(m*Math.pow(2,k));
            k++;
            count++;
        if(count>3){
             brr[i] = arr[sum];
             i++;
             count = 0;
             k=0;
             sum = 0;
          }

        }
         for(int j = i-1;j>=0;j--){
             System.out.print(brr[j]);
         }
       
        
            
            


        
        


        
        
    }
}