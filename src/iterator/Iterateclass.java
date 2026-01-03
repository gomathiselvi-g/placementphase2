package iterator;
import java.util.Iterator;
import java.util.LinkedList;
public class Iterateclass {
			public static void main(String[] args) {
				LinkedList<Integer> l=new LinkedList<>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(2);
				l.add(4);
				l.add(8);
				l.add(6);
				l.add(5);
				l.add(6);
				System.out.println("Array");
				System.out.println(l);
				System.out.println("by iterrator");
				Iterator<Integer> it=l.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
}
}