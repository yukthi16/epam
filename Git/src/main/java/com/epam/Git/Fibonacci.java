package com.epam.Git;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String s[]) {
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a=0,b=1,c=0;
    for(int i=2;i<=n;i++)
    {
    	c=a+b;
    	a=b; b=c;
    }
    if(n==0)
    	 System.out.println(0);
    else if(n==1)
    	 System.out.println(1);
    else
    	 System.out.println(c);
    in.close();
}
}