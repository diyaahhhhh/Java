package javaStubs;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
	    int i;
	    int[] ARR= new int [5];
	    System.out.println("Enter the elements:");
	    for(i=0;i<5;i++) {
		     Scanner sc= new Scanner(System.in);
		     ARR[i]=sc.nextInt();
	      }
	    for (int num:ARR) {
	        System.out.print(num+"\t");
	      }
	   }
}
