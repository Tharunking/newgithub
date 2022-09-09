package com.normal;
import java.util.*;
public class prime {
	public static void main(String args[])
	{
		int a[]= {-12,56,-24,67,11};
		ArrayList<Integer>b=new ArrayList<Integer>();
		//int b[]=new int[b.length];
		int c=0;
		for(int i=0,j=0;i<a.length;i++)
		{
			if(a[i]%2!=0) {
				
				b.add(i);
				//System.out.print(b.getIndex(i));		
			}
			else {
				c++;
			    if(c==a.length) {
			    	System.out.print("-2");
			    }
			
		}
		Object [] arr=b.toArray(); 
	for(int i1=0;i1<arr.length;i1++)
			System.out.println(arr[i1]);
		}
	}
}
