package programs;
import java.util.Set;
import java.util.HashSet;

public class Hashsett {

				public static void main(String[] args) {
					Set<String> s=new HashSet<>();
					s.add("Gomathi");
					s.add("Jothika");
					s.add("Karpagam");
					s.add("Ganesh");
					s.add("Gomathi");
					s.add("Sieyash");
					s.add("Sieyash");
					s.add("Pappoo");
					s.add("Nila");
					s.add("subash");
					System.out.println(s);
					System.out.println(s.size());
					System.out.println(s.isEmpty());
					System.out.println(s.contains("Gomathi"));
					System.out.println("remove = " +s.remove("Gomathi"));
					s.clear();
					System.out.println(s);
					
				}

		}
