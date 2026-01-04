package programs;
import java.util.Scanner;
class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        boolean[] letters = new boolean[26];
         for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!letters[i]) {
                isPangram = false;
                break;
            }
        }
        if (isPangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
        sc.close();
    }
}
    





