import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class minSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0;
        for(int i=0 ; i< arr.length-1;i++ ){
            for(int j=0 ; j<arr.length-1-i;j++)
            if(arr[i] > arr[j+1 ]){
               arr = swap(arr,i,j+1);
                count++;
            }
        }
        for(int i = 0;i <arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        return  count;
    }

    private static int[]  swap(int [] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);


        System.out.println(String.valueOf(res));
        System.out.println("\n");

        scanner.close();
    }
}
