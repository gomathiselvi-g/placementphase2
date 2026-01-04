package oops;

public class PangramNumber {
	  public static void main(String[] args) {
		String sentence ="0987654321";
		sentence=sentence.toLowerCase();
		boolean[] present = new boolean[10];
		for(int i=0;i<sentence.length();i++) {
			char ch= sentence.charAt(i);
			if(ch>='0' && ch<='9') {
				present[ch - '0']= true;
			}
		}
		for (boolean value: present){
			if(!value) {
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
