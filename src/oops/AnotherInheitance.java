package oops;

import java.util.Scanner;
	class VcetV1{

		int fees=10000;

		VcetV1(){

			super();

			System.out.println("Parent class constructor");

		}

		void rules() {

			System.out.println("Id, Shoes and Formals must");

		}

	}

	class VcetV2 extends VcetV1{

		VcetV2(){

			super();

			System.out.println("Child class constructor");

		}

		int fees=20000;

		void rules() {

			super.rules();

			System.out.println("Id, Shoes are must");

			System.out.println("Fees : "+fees);

			System.out.println("old Fees : "+super.fees);

		}

	}

	public class AnotherInheitance {

		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);

			VcetV1 ob=new VcetV2();//is-a  relationship

			ob.rules();

			int num=sc.nextInt();//has-a relationship

		}
	
		}




