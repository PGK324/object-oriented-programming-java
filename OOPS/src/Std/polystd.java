package Std;

import java.util.Scanner;

public class polystd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Stdd a=new Stdd();
		String sn=s.next();
		int id=s.nextInt();
		String clg=s.next();
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		a.std(sn);
		a.std(id,clg);
        a.std(m1,m2,m3);
	}

}
