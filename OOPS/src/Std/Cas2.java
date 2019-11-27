package Std;
import java.util.Scanner;
public class Cas2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Currentbill cb=new Currentbill();
		Telebill tb=new Telebill();
		System.out.println("Enter The Telephone bill No");
		tb.setTlb(s.nextInt());
		System.out.println("Enter The Customer Name");
		tb.setCn(s.next());
		System.out.println("Enter The No of Calls");
		tb.setNc(s.nextInt());
		System.out.println("Enter The Cost per Call");
		tb.setCc(s.nextInt());
		System.out.println("Enter The Customer name");
		cb.setCun(s.next());
		System.out.println("Enter The Bill no");
		cb.setCbn(s.nextInt());
		System.out.println("Enter The Number of unit");
		cb.setNou(s.nextInt());
		System.out.println("Enter The Cost per Unit");
		cb.setCpu(s.nextInt());// TODO Auto-generated method stub
        tb.display();
        cb.display();
	}

}
