package lab1;

import java.util.Scanner;

public class Grading {
public static void main(String[] args) {
	System.out.print("Enter the marks:");
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	if (m>=90){
		System.out.println("Grade A");
	}
	else if(m>=75) {
		System.out.println("Grade B");
	}
	else if(m>=60) {
		System.out.println("Grade C");
	}
	else if(m>=40) {
		System.out.println("Grade D");
	}
	else {
		System.out.println("Fail!");
	}
}
}
