package javaStubs;

import java.util.Scanner;

public class CopyArr {
  public static void main(String[] args) {
	  int[] ARR1=new int[4];
	  int[] ARR2=new int[4];
	  int i;
	  System.out.println("Enter elements:");
	  Scanner sc=new Scanner(System.in);
	  for(i=0;i<ARR1.length;i++) {
		 ARR1[i]=sc.nextInt();
		 ARR2[i]=ARR1[i];
	  }
	 System.out.println("Copied array:");
	 for(i=0;i<ARR1.length;i++) {
		 System.out.print(ARR2[i]+"\t");
	 }
  }
}