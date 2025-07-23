package lab1;

import java.util.Scanner;

public class PrintOdd {
public static void main(String[] args) {
	int i;
	System.out.println("Printing numbers from 1 to 50...");
	for(i=1;i<=50;i++) {
		if(i%2==0)
		{
			continue;
		}
	System.out.println(i);

	}
}
}
