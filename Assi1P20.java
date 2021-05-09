import java.lang.*;
import java.util.*;
class Assi1P20{
	public static void main(String [] args){
		int rem = 0;
		String arr[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal number");
		int decimal = sc.nextInt();
		String[] brr = new String[10];
		int count = 0;
		while(decimal>0){
			
			count++;
			rem = decimal%16;
			decimal = decimal/16;
			brr[count] = arr[rem];
		
		}
		for(int i = count;i>0;i--){
			System.out.print(brr[i]);
		}	
			
			
			
			
		
		
		
		
		
	}
}
