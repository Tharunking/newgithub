package com.normal;
import java.util.*;
import java.util.Arrays;

public class count {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);

	int a[]=new int[5];
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
	}
	int val=sc.nextInt();
	Arrays.sort(a);
	for(int i=0;i<5;i++)
	{
		if(val==a[i]) {
			System.out.print(i+" ");
		}
		
		}
	
}}

