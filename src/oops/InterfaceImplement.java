package oops;

interface test{
	void display();
	void show();
}

public class InterfaceImplement implements test {	
	public void display() {
		
		System.out.println("display");
	}	
	public void show() {
		System.out.println("show");
		
		
	}
	public static void main(String...a) {
		InterfaceImplement intf=new InterfaceImplement();
		intf.display();
	}
	

}
