package oops;

public class staticKeyword {
	static int p = 10;
	static int q;
	String name="Seth";
	String lastName = "Raghav" ;
	static String city="GGN";
	
	static {
		System.out.println("Static block");
		q=p*10;
		
	}
	staticKeyword(String name1,String last){
		name=name1;
		lastName=last;		
	}
	void display() {
		System.out.println(name+" "+lastName+" "+city);
	}
	
	public static void main(String...a) {
		System.out.println("test");
		System.out.println(p);
		System.out.println(q);
		staticKeyword s1=new staticKeyword("Ram", "Seth");
		staticKeyword s2= new staticKeyword("Shyam", "seth");
		s1.display();
		s2.display();
	}

}
