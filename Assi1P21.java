import java.lang.*;
import java.util.*;
class Assi1P21{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal number");
		int a = sc.nextInt();
		int rem = 0,count = 0;
		int i =0;
		int [] arr = new int[10];
		while(a>0){
			count++;	
			rem = a%8;
			a = a/8;
			arr[i] = rem;
			i++;
			
		}
		for(int j =count-1;j>=0;j--){
			System.out.print(arr[j]);
		}	
		
	}
}
