package interviewprogram;

import java.util.Scanner;

public class Checkbinary {

	public static void main(String[] args) {
//		Checkbinary obj=new Checkbinary();
//		obj.isbinary(10101);
//		System.out.println(obj.isbinary(1010));
		
		int no;
		System.out.println("Enter the binary no");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		System.out.println(isbinary(no));
		
	}

	public static boolean isbinary(int no) {
		while(no!=0) {
			if(no%10>1) {
				return false;
			}
			no=no/10;
		}
		return true;
		
		
	}
	
	
}
