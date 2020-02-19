package oops;

abstract class AbstractImplement {
	 abstract public void display() ;
	 
	 public void show() {
		 System.out.println("Show method from show abstract parent");
	 }	
	 
	public static void main(String... a) {
		ChildClass ch=new ChildClass();
		ch.display();
		
	}	

}
class ChildClass extends AbstractImplement{

	@Override
	public void display() {
		System.out.println("Abstract overridden method from child");		
		
	}
	
}

