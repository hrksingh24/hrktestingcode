package apachepoi;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number");
		
int numberofline=scan.nextInt();

int row=1;
int column=1;

for(int i=0; i<=numberofline;i++) {
	
	for(int j=0; j<=i; j++) {
		
		System.out.print("1");
	}
	System.out.println();
}
		
	}

}
