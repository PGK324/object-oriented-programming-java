package inheritance;
import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Nokia d=new Nokia();
System.out.println("enter the name");
String n=s.next();
d.about();
d.spec(n);


	}

}
class Mobiles
{
	void about()
	{
	System.out.println("welcome to our world");
	System.out.println("sony");
	System.out.println("xi");
	System.out.println("oppo");
}}
class Nokia extends Mobiles
{
	void spec(String dd)
	{
		if(dd.contentEquals("sony")) {
		System.out.println("model number is available");	
	}
		if(dd.contentEquals("xi")) 	
		{
			System.out.println("model number is available");	
		}
		if(dd.contentEquals("oppo")) {
			System.out.println("model number is available");
		}
}
}

	
