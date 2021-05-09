import java.lang.*;
import java.util.*;
class Assi1P25{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = 0;
		int k = 0;
		int decimal = 0;
		while(a!=0){
			n = a%10;
			a = a/10;
			decimal = decimal + (int)(n*Math.pow(8,k));
			k++;
			
			
			
		}
		System.out.println(decimal);	
	}	
}