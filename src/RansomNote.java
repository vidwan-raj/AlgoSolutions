import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        if (note.length > magazine.length) {
            System.out.println("No");
            return;
        }
        Hashtable<String, Integer> magazineTable = new Hashtable<>();
        for (String magValue : magazine) {
            if (magazineTable.containsKey(magValue)) {
                magazineTable.put(magValue, magazineTable.get(magValue)+1) ;
            } else {
                magazineTable.put(magValue, 1);
            }
        }
        String result = null;
        for (String noteValue : note) {
            if (magazineTable.containsKey(noteValue)) {
                magazineTable.put(noteValue , magazineTable.get(noteValue)-1);
                if(magazineTable.get(noteValue) < 0){
                    result = "No";
                    break;
                }
                result = "Yes";

            } else {
                result = "No";
                break;
            }
        }
        System.out.println(result);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

