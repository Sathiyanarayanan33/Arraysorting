package interviewprogram;

import java.util.Arrays;

public class CommonElementA {

	public static void main(String[] args) {
		CommonElementA obj=new CommonElementA();
		obj.singlearrcommonelement();
		//obj.arrcommonelement();
		//obj.sortingarray();
		//obj.smallestarr();
		//obj.largestarr();
		//obj.secondlargestarr();
	    //obj.Secondlargestarr_2();
	    //obj.data();
		//obj.swappingarray();
		//obj.mergetoarray();
		//obj.arrayreverse();
	}
	public void singlearrcommonelement() {
		int no []= {10,30,20,10,40,50,30};
		for(int i=0; i<no.length; i++) {
			for(int j=i+1; j<no.length; j++) {
				if(no[i]==no[j]) {
					System.out.println(no[i]);
				}
			}
		}
	}
public void arrcommonelement() {
		int arr []= {2,3,4,5,6,7};
		int arr1 []= {8,9,4,1,7,11};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr[i]==arr1[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

public void sortingarray() {
	
	int arr[]= {10,20,30,50,70,40,22};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
}

public void smallestarr() {
	int arr[]= {10,8,4,3,1};
	int small=Integer.MAX_VALUE;
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<small) {
			small=arr[i];
		}

	}
	System.out.println(small);
	
}
public int largestarr() {
	int a[]= {10,9,11,1,4,5};
	int bigg=Integer.MIN_VALUE;
	
	for(int i=0; i<a.length; i++) {
		if(a[i]>bigg) {
			bigg=a[i];	
		}
	}
	return bigg ;
	
}
public void secondlargestarr() {
	//unsorting array
	int ar []= {10,20,2,19,69,70};
    int num=ar.length;
    //array sorting
    Arrays.sort(ar);
    System.out.println(ar[num-2]);//ans became second largest number
}

public void Secondlargestarr_2() {
	int arr []= {10,20,30,9,8};
    int m1=0,m2=0;
    
    for(int i=0; i<arr.length; i++) {
    	if(m1<arr[i]) {
    		m2=m1;
    		m1=arr[i];
    	}
    	else if(m2<arr[i]) {
    		m2=arr[i];
    	}
    }
    System.out.println(m2);
}
public void data() {
	
int arr []= {10,20,30,25,32};
int back=arr.length;

Arrays.sort(arr);
System.out.println(arr[back-2]);

}

public void swappingarray() {
	int a[]= {1,2,3,5};		
	int b[]= {3,4,5,6};
	for(int i=0; i<a.length; i++) {
		int temp=a[i];
		a[i]=b[i];
		b[i]=temp;
	}
	System.out.println("a: "+ Arrays.toString(a));
	System.out.println("b: "+ Arrays.toString(b));
}

public void mergetoarray() {
int a[]= {1,2,3};			
int b[]= {4,5,6};	
int c[]=new int[a.length+b.length];

for(int i=0; i<a.length; i++) {
c[i]=a[i];
}
for(int i=0; i<b.length; i++) {
c[i+a.length]=b[i];
}

System.out.println(Arrays.toString(c));
}

public void arrayreverse() {
	
	int arr []= {10,20,30,40,50};
	int i=0, j=arr.length-1;
	
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i=i+1;
		j=j-1;
	}
	for(int k=0; k<arr.length; k++) {
		System.out.println(arr[k]);
	}	
//	int no[]= {3,5,7,8,9,1,10};
//	
//	for(int i=no.length-1; i>=0; i--) {
//		System.out.println(no[i]);
//	}
}

}
