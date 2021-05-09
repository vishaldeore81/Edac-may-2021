import java.lang.*;
import java.util.*;
class Assi1P17{
	public static void main(String [] args){
		int k = 0;
		int p =0;
		int carry = 0;
		int l = 0;
		int i = 0;
		int[]arr = new int[12];
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m  = sc.nextInt();
		while(n!=0||m!=0||carry==1){
			k = n%10;
			n = n/10;
			l = m%10;
			m = m/10;
			p = k+l+carry;
			if(p==2){
				arr[i] = 0;
				i++;
				carry = 1;
			}
			else if(p==3){
				arr[i] = 1;
				carry = 1;
				i++;
			}	
			else{
				arr[i] = p;
				i++;
				carry = 0;
			}	
			
			
			
		}
		System.out.println("Addition of binary number is:");
		for(int j = i;j>=0;j--){
				System.out.println(arr[j]);
		}		
			
		
	}	
}