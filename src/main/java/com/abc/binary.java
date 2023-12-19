package com.abc;

public class binary {
	public static void main(String args[]){
		int s[]={9,7,3,81,1,9};
		int f=0,l=s.length-1;
		int a[]=sort.sorting(s);
		int k=1;
		int mid=(f-1)/2;
		while(f<=1){
			if(a[mid]<k)
				f=mid+1;
			else if(a[mi]==k)
				System.out.println(k);
			else
				l=mid-1;
			mid=(f+1)/2;
		}
		if (f>1)
			System.out.print("no");
	}
}
