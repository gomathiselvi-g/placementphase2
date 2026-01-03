package programs;
import java.util.HashMap;
public class Practice {
    public static void main(String[] args) {
    	HashMap<Character,Integer> h= new HashMap<>();
    	String str="engineering";
    	for(char ch:str.toCharArray()) {
    		if(h.containsKey(ch)) {
    			h.put(ch, h.get(ch)+1);

			}
    		else {
    			h.put(ch,1);
    		}
    	
    }
    	System.out.println(h);
  
    	System.out.println(h.keySet());
    	}
    }