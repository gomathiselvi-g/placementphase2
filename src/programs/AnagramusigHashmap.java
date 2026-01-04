package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramusigHashmap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

    
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Length check
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // HashMap to store character count
        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in first string
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Reduce count using second string
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (!map.containsKey(ch)) {
                System.out.println("Not Anagram");
                return;
            }
            map.put(ch, map.get(ch) - 1);
        }

        // Check if all counts are zero
        for (int value : map.values()) {
            if (value != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
        sc.close();
    }
}
