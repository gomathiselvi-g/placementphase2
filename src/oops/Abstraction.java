package oops;

abstract class Hotel{ 
	abstract void sambar(); //cant define the method in the parent class
	void dosa() {
		System.out.println("Cooking in front of all");
		
	}
}
class Kitchen extends  Abstraction { 
	void sambar() { //can only define in the child class
		System.out.println("Cooking sambar in Kitchen");
	}
}
	
public class Abstraction {
	public static void main(String[] args) {
		Bean b=new Bean();
		b.setter(100);
		System.out.println(b.getter());
	}

}
