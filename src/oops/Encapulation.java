package oops;
import java.util.Scanner;
class Bean{
	private int num=10;
	public int getter() {
		return num;
	}
	public void setter(int n) {
		num=n;
	}
}
public class Encapulation {
	public static void main(String[] args) {
		Bean b=new Bean();
		b.setter(100);
		System.out.println(b.getter());
	}

}
