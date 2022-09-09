package com.normal;

import java.util.Arrays;
import java.util.Scanner;

public class rpg 
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
		//Arrays.sort();
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

