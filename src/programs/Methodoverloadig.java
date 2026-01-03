package programs;

public class Methodoverloadig {
	
		String name;

		int roll;

		static String clg="VCET";

		void setter(){

			System.out.println("No Parameter method");

		}

		void setter(float fl){

			System.out.println(fl);

		}

		void setter(String n,int r){

			name=n;

			roll=r;

		}

		void setter(int r,String n){

			name=n;

			roll=r;

		}

		void disp() {

			System.out.println(name+" "+roll+" "+clg);

		}

		void setter(int num1,float num2) {

			System.out.println(num1+num2);

		}

		void setter(float num2,int num1) {

			System.out.println(num1-num2);

		}




		public static void main(String[] args) {

			methodoverloading ob1=new Test();

			ob1.setter(10,22.25f);

			ob1.setter(22.25f,10);

			//ob1.setter(20,10); can't invoke (Exception)

			ob1.disp();

		}

	}



}
