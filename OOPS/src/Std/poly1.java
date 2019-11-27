package Std;



class poly1 {
public static void main(String[]args) {
	
    Demo obj=new Demo();
    obj.disp();
    
	}

}

class polyy
{
	public void disp() {
		System.out.println("parentclass");	
		
		}
}
class Demo extends polyy
{
	public void disp() {
		super.disp();
	System.out.println("child class");	
	
	}
}
