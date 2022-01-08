package Java_Programs;

import java.util.Scanner;

public class E_02_GettingInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String s1=input.nextLine();
		int num=input.nextInt();input.nextLine();
		String s2=input.nextLine();
		System.out.println(s1+" "+s2+" "+num);
		
	}

}
