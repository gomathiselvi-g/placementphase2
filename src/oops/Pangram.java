package oops;

public class Pangram {
  public static void main(String[] args) {
	String sentence ="The quick brown fox jumps over the lazy dog";
	sentence=sentence.toLowerCase();
	boolean[] present = new boolean[26];
	for(int i=0;i<sentence.length();i++) {
		char ch= sentence.charAt(0);
		if(ch>='a' && ch<='z') {
			present[ch - 'a']= true;
		}
	}
	for (boolean value: present){
		if(value) {
			System.out.println("not a pangram");
			return;
		}
		else {
			System.out.println("pangram");
			return;
		}
	}
}
}
