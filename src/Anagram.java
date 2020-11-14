import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagram {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
      int anagrams = 0;
      int len = s.length();
      while(len > 0){
          char[] a = new char[len];
          for(int i = 0 ; i < s.length()-1; i++ ){
              a[i] = s.charAt(0);
              for(int j= i+1; j<len; j++){
                  a[j] = s.charAt(j);
              }
          }
          len--;
      }

      return  anagrams;
    }

    private static boolean isAnagram(char[] a, char[] b) {
        Hashtable<Character, Integer> string1 = new Hashtable<>();
        for (char c : a) {
            if (string1.get(c) != null) {
                string1.put(c, string1.get(c) + 1);
            } else {
                string1.put(c, 1);
            }
        }
        for (char d : b) {
            if (string1.containsKey(d)) {
                string1.remove(d);
            }
        }
        if (string1.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            System.out.println(String.valueOf(result) + "\n ");
        }

        scanner.close();

    }
}
