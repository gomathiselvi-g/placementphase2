package oops;

public class Inheritance {
               void dadmobile() {
            	   System.out.println("Its dad mobile");
               }
}
class Kavin extends Inheritance{
	void KavinMobile(){
	System.out.println("its kavin mobile");
}
}
class KavinBro extends Inheritance{
	void KavinBroMobile(){
	System.out.println("its kavin mobile");
	}
class KavinSon extends Kavin{
	void kavinsonmobile() {
		System.out.println("its kavin son mobile");
	}
	}
}
