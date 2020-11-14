import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class ChaosQueue {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int minBribes = 0;
        String reason = null;
        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                reason = "Too chaotic";
                break;
            }
            for (int j = Math.max(0, q[i] - 1 - 1); j < i; j++)
                if (q[j] > q[i])
                    minBribes++;
        }
        if(reason == null && minBribes > 0) System.out.println(minBribes);
        if(reason != null )  System.out.println(reason);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
