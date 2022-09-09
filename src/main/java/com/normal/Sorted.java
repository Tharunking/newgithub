package com.normal;
import java.util.*;
//System.out.println("enter m");
/*int m=sc.nextInt();
		//System.out.println("enter n");
		int n=sc.nextInt();
		//System.out.println("enter array");
		int arr1[]=new int[m];
		int arr2[]=new int[n];
		int arr3[]=new int[m+n];
		ArrayList<Integer>al=new ArrayList<Integer>();
		ArrayList<Integer>a2=new ArrayList<Integer>();
		
		for(int i=0;i<m;i++)
		{
			al.add(sc.nextInt());
		}
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		//System.out.println("enter k");
		int k=sc.nextInt();
		Collections.sort(al);
		for(int i:al)
		{
			System.out.println(al.get(k-1));
		}
		
	//	System.out.println(al.get(k-1));
	}
		
		int a[]= {1,2,3,4,5};
		int k=2;
		int l=a.length;
		int a1[]=new int[a.length];
		for(int i=k,j=0;i<l&&j<l;i++,j++)
		{
			a1[j]=a[i];
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a1[j]);
		}
		
		System.out.println("tharun");
	}

import java.util.*;

		public class Sorted {
		public static void main(String args[])
		{
			

		int a[]= {1,1,1,1,1,2,2,2,2,2,3,3};
		int c=0;
		Arrays.sort(a);
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]==a[j+1])
				{
					if(a[j]==0)
						 break;
					else
					{
						a[j]=0;
						a[j+1]=0;
						c++;
					}
				} 
			}
		}
		System.out.println(c);
		}
public class Sorted {
public static void main(String args[])
{
	int n=20;
	int d=10;
	
	int a[]= {41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51};
	//int a[i]=0;
	for(int i=d;i<n;i++)
	{
		
		System.out.print(a[i]+" ");

	}
	for(int i=0;i<d;i++)
	{
		
		System.out.print(a[i]+" ");
		

	}
	
	
	/*for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}*/
	public class Sorted 
	{  //rpg  game........
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
	        int exp=sc.nextInt();
			int a[]=new int[n];  //  78 130
			int b[]=new int[n]; //  10 0	
			for(int i=0;i<n;i++)
			{			
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{				
				b[i]=sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int c=0;
			for(int i=0;i<n;i++) {
				if(exp>=a[i]) {
					exp+=b[i];
				    c++; }
				else {
					break;
					}	
				}
			System.out.println(c);
			}
		}

