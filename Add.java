package lab1;

import java.util.Scanner;

public class Add {
public static void main(String[] args) {
	int Sum;
	System.out.print("Enter two numbers:");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	Sum=num1+num2;
	System.out.println("Sum:"+Sum);
}
}
