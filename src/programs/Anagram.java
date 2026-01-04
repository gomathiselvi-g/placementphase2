package programs;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);
                System.out.print("Enter first string: ");
		        String s1 = sc.nextLine();
		        System.out.print("Enter second string: ");
		        String s2 = sc.nextLine();
		        if (s1.length() != s2.length()) {
		            System.out.println("Not Anagram");
		            return;
		        }
		        /* int[] count = new int[256];
		           for(int i=0;i<=s1.length();i++;
		           count[s1.charAt(i)]++;                                    //another method
		           }
		          
		           for(int i=0;i<=s2.length();i++;
		           count[s1.charAt(i)]--;
		           }
		           for(int i=0;i<256;i++){
		           if(count[i]!=0){
		           System.out.println("not an anagram");
		           }
		          }
		           
		         */
		        char[] a1 = s1.toCharArray();
		        char[] a2 = s2.toCharArray();
		        Arrays.sort(a1);
		        Arrays.sort(a2);
		        if (Arrays.equals(a1, a2)) {
		            System.out.println("Anagram");
		        } else {
		            System.out.println("Not Anagram");
		        }

		        sc.close();
		    }
		}
