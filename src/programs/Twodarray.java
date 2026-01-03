package programs;
import java.util.ArrayList;
public class Twodarray {
public static void main(String[] args) {
	ArrayList<ArrayList<String>> li= new ArrayList<>();
	li.add(new ArrayList<>());
	li.add(new ArrayList<>());
	li.add(new ArrayList<>());
	System.out.println(li.size());
	System.out.println(li.get(1).size());
	li.get(0).add("Gomathi");
	li.get(0).add("selvi");
	li.get(1).add("Ganesh");
	li.get(1).add("Karpagam");
	li.get(1).add("Jothika");
	li.get(2).add("pappoo");
	li.get(2).add("subash");
	li.get(2).add("nila");
	li.get(2).add("Ganesh");
	System.err.println(li);
	System.out.println(li.get(0).get(1));
	System.out.println(li.get(1).get(1));
	System.out.println(li.get(2).get(1));
	System.err.println("max letters in a word");
    for(ArrayList<String> l:li) {
    	String op="";
    	int max=0;
    	for(String st:l) {
    		if(max<st.length()) {
    			max=st.length();
    			op=st;
    		}
    	}
    	System.out.println(op);
    }
	
}
}
