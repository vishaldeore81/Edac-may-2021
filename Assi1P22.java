import java.lang.*;
import java.util.*;
class Assi1P22{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the binary number");
		int n = 0,temp = 0;
		int binary = sc.nextInt();
		while(binary!=0){
			int m = binary%2;
			binary = binary/10;
			temp = temp + m*(int)Math.pow(2,n);
			n++;
		}
		System.out.print("Decimal number is:"+temp);
		
	}

}

