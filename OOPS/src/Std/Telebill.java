package Std;

public class Telebill {
	int tlb;
	String cn;
	int nc;
	float cc;
	public int getTlb() {
		return tlb;
	}
	public void setTlb(int tlb) {
		this.tlb = tlb;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public int getNc() {
		return nc;
	}
	public void setNc(int nc) {
		this.nc = nc;
	}
	public float getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	void display()
	{
		System.out.println("Bill no :"+tlb);
		System.out.println("Customer name :"+cn);
		System.out.println("No of Calls :"+nc);
		System.out.println("cost of call :"+cc);
	}
	

}
