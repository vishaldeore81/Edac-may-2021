import java.lang.*;
import java.util.*;
class Assi1P19{
	public static void main(String [] args){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first binary number");
		int a = sc.nextInt();
		int [] arr = new int[8];
		for(int i =0;i<=arr.length-1;i++){
			while(a!=0){
				arr[i]=a%2;
				a = a/2;
			}
			
			
			
		}
		for(int j =7;j>=0;j--){
			System.out.print(arr[j]);
		}	
			
			
	}
}




