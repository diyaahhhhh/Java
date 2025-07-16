package lab1;

import java.util.Scanner;

public class Printnatural {
public static void main(String[] args) {
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number to generate the range:");
	int num=sc.nextInt();
	for(i=1;i<num;i++)
	{
		System.out.print(i+"\t");
	}
}
}
