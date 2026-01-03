package programs;
public class This {
		String name;
		int roll;
		static String clg="VCET";
		This(){
			System.out.println("Default Constructor");
		}
		This(String name,int r){
			this();
			this.name=name;
			roll=r;
		}
		void disp(This ob) {
			System.out.println(ob);
			System.out.println(this.name+" "+this.roll+" "+clg);
		}
		void meth() {
		System.out.println(this);
			this.disp(this);
		}
		public static void main(String[] args) {
			This ob1=new This("Kavin",44);
			This ob2=new This("Soniya",49);
			System.out.println(ob1);
			ob1.meth();
			System.out.println(ob2);
			ob2.meth();
		}
	}

