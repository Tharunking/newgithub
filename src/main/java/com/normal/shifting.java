package com.normal;

public class shifting {
public static void main(String args[])
{
	int n=5;
	int d=4;
	int a[]= {1,2,3,4,5};
	for(int i=0;i<d;i++)
	{
		a[i]++;
		System.out.println(a[i]);
	}
	for(int i=d;i<n;i++)
	{
		a[i]++;
		System.out.println(a[i]);
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}
}
