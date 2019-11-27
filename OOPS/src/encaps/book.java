package encaps;
import java.util.Scanner;
public class book {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1;
		int a;
		Bookw bk=new Bookw();
	
		System.out.println("Name of the book");
		bk.setBook(s.next());
		System.out.println("ISBN Number");
		bk.setIsn(s.nextInt());
		System.out.println("Publisher Name");
		bk.setPname(s.next());
		System.out.println("Price of a book");
		bk.setPob(s.nextInt());
		System.out.println("Number of Customer");
		bk.setNoc(s.nextInt());
		a=bk.getNoc();
		do
		{
		System.out.printf("Details of Customer%d\n",i);
		i++;
		System.out.println("Name");
		bk.setN(s.next());
		System.out.println("Enter the Gender");
		bk.setG(s.next());
		a--;
		}while(a>0);
		bk.display(bk.getBook(),bk.getIsn(),bk.getPname(),bk.getPob(),bk.getNoc(),bk.getN(),bk.getG());
		//bk.getBook();// TODO Auto-generated method stub
		}
	}


class Bookw{
	String book;
	int isn;
	String pname;
	int pob;
	int noc;
	String doc;
	String n;
	String g;
	public String getBook() {
		return book;
	}
	public void display(String book2, int isn2, String pname2, int pob2, int noc2,String n2,String G2) {
		System.out.println("Book Details are");
		System.out.println("Name of the Book   :"+book2);
		System.out.println("ISBN Number of the Book :"+isn2);
		System.out.println("Publisher name of the Book:"+ pname2);
		System.out.println("Number of Customers :"+noc2);
		System.out.println("Price of a book     :"+pob2);
		System.out.println("Customer Name  :"+n2);
		System.out.println("Gender M/F  :"+G2);
		
		// TODO Auto-generated method stub
		
	}
	public void setBook(String book) {
		this.book = book;
	}
	public int getIsn() {
		return isn;
	}
	public void setIsn(int isn) {
		this.isn = isn;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPob() {
		return pob;
	}
	public void setPob(int pob) {
		this.pob = pob;
	}
	public int getNoc() {
		return noc;
	}
	public String getG() {
		return g;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	public String getDoc() {
		return doc;
	}
	public String getN() {
		return n;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public void setN(String n) {
		this.n = n;
	}
	public void setG(String n) {
		this.g = g;
	}

}


