package oops;


class Child extends InheritanceBase{
	public void display() {
		System.out.println("Display Child Class");		
		super.display();
	}
	public void game()
	{
		System.out.println("game method child");
	}
}

public class InheritanceBase {	
	public static void main(String ...a) {
		//InheritanceBase ibase = new InheritanceBase();
		//ibase.display();		
		//Child child = new Child();
		//child.display();
		//child.show();
		//InheritanceBase ibase1=new Child();
		//ibase1.game();
		
	}
	public void display() {
		System.out.println("Display Parent Class");		
	}
	public void show() {
		System.out.println("Parent show method");
	}

}
