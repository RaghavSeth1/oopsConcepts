package oops;

interface iface1{
	 void disp();
	
}
interface iface2 extends iface1{
	
	void show();
}

public class MultInheritViaInterface implements iface2 {

	public void disp() {	
		System.out.println("Disp");
	}

	public void show() {
		System.out.println("Show");		
	}
	public static void main(String... a) {
		MultInheritViaInterface miface = new MultInheritViaInterface();
		miface.disp();
		miface.show();
	}

}
