package Sele;

public class Constructer {

	String CompanyName="TCS";
	String Ename;
	int id;
	Double salary;
	
	public Constructer(String Ename, int id, double salary) {
		this.Ename= Ename;
		this.id=id;
		this.salary=salary;
		System.out.println("Ename+id+salary");
	}
		
		public Constructer() {
		System.out.println("Test Automation");
		}
		public Constructer(int work) {
			System.out.println("Ename+CompanyName+salary+id");
		
		
		
	}
	
	public static void main(String[]args) {
		new Constructer("rahul",3433,50000);
	
		
		
	}

	private void test() {
		System.out.println("c");
		
	}
	
	
	
}