package javabasic;

import java.util.Scanner;

public class Practicebymyself {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	  	//System.out.print("In:");
	  	int num =inp.nextInt();
	  	System.out.println("please enter number");
	  if(num> 0) {
	    System.out.println(num+"is positive");
	  }else if(num< 0) {
	      System.out.println(num+"is negative");
	    }else if(num==0) {
	        System.out.println("in entered number is equals to 0");
	       }

	}

}
