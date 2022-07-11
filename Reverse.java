package com.java.Bharath;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
        System.out.print("Reversed Number is "+ reverse(n));

	}
	static int reverse(int n){
	       
	      int rev = 0; 
	      int rem;   
	       
	      while(n>0){	          
	        rem = n%10;
	        rev = (rev*10) + rem;
	        n = n/10;
	      }
	      
	      return rev;
	    }

}
