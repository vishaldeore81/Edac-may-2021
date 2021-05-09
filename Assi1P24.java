import java.lang.*;
import java.util.*;
class Assi1P24{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int m = 0;
        int count = 0;
        int k = 0;
        int  sum = 0;
        int i = 0;
        
        int brr[] = new int[10];
        while(n!=0){
            m = n%10;
            n = n/10;
            sum =sum +(int)(m*Math.pow(2,k));
            k++;
            count++;
        if(count>2){
             brr[i] = sum;
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
       
        
            
            


        
        


        
        
    

    
