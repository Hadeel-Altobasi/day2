package jo.secondstep.Agame;

import java.util.Scanner;

public class AGame {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length, width;
		System.out.println("Plz Enter the length ");
		length = scan.nextInt();
		System.out.println("Plz Enter the width ");
		width = scan.nextInt();
		
		if (width % 2 != 0 && length % 2 != 0)
			System.out.println("First Player Win");
		else if (width==1 || length==1)
			System.out.println("First Player Win");
		else if (width % 2 == 0 || length % 2 == 0)
			System.out.println("Second Player Win");
	}

}
