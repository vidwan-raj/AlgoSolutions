import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int[] sum = new int[16];
        int count =0;
        int matrixSum = 0 ;
        for(int matrix = 0 ; matrix <(arr.length - 2); matrix++) {
            for (int i = 0; i < (arr.length - 2); i++) {
                for (int k = 0; k < 3 ; k++) {
                    if (k == 1) {
                        matrixSum += arr[matrix + k][i+1];
                    } else {
                        for (int j = i; j < (i+3); j++) {
                            matrixSum += arr[matrix+k ][j];
                        }
                    }
                }
                sum[count++] = matrixSum;
                System.out.println(matrixSum);
                matrixSum = 0;
            }
        }

        int max = sum[0];
        for(int i=0 ; i< sum.length ;i++){
            if(sum[i] > max){
                max = sum[i];
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println("sum :" + result);
        scanner.close();
    }
}
