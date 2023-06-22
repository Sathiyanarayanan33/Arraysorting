package interviewprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Array_sorting {

	public static void main(String[] args) {
		Array_sorting obj=new Array_sorting();
		obj.buildinmethod();
		//obj.sorting();
		//obj.scannertry();
	}
	
	public void buildinmethod() {
		int arr []= {50,30,40,10,20};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void sorting() {
		
		int arr []= {20,40,50,10,30};
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(arr[i]+ " ");
	}
	}
	public void scannertry() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array size");
		int no=sc.nextInt();
		int arr []=new int[no];
		System.out.print("Enter a array value");
		
		for(int i=0; i<no; i++) {
			arr[i]=sc.nextInt();
		}
	for(int i=0; i<no; i++) {
		for(int j=i+1; j<no; j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0; i<no; i++) {
		System.out.print(arr[i]+ " ");
	}
	}
	
}
