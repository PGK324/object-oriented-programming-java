package Std;

public class Currentbill {
	int cbn;
	String cun;
	int nou;
	float cpu;
	public int getCbn() {
		return cbn;
	}
	public void setCbn(int cbn) {
		this.cbn = cbn;
	}
	public String getCun() {
		return cun;
	}
	public void setCun(String cun) {
		this.cun = cun;
	}
	public int getNou() {
		return nou;
	}
	public void setNou(int nou) {
		this.nou = nou;
	}
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	
	void display()
	{
		System.out.println("customer name :"+cun);
		System.out.println("Bill no :"+cbn);
		System.out.println("No of unit :"+nou);
		System.out.println("cost per unit :"+cpu);
	}
	

}
