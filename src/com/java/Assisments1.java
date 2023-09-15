package com.java;
import java.util.Scanner;
public class Assisments1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan  =  new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int n = scan.nextInt();
		int r,sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("number is armstrong: ");
			
		}
		else {
			System.out.println("number is not armstrong: ");
			
			
		}

	}

}
