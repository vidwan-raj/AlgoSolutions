import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class GeometricTriplets {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
     long count = 0;
     Hashtable<Long , Integer> countMap = new Hashtable<>();
     for(Long value : arr){
        if(countMap.containsKey(value)){
            countMap.put(value,countMap.get(value)+1);
        }else{
            countMap.put(value,1);
        }
     }


     Hashtable<Long,Integer> tripletMap = new Hashtable<>();
     for(Long value : arr){
         if(countMap.containsKey(value*r)){
             tripletMap.put(value,1);
             if(countMap.containsKey(value*r*r)){
                 tripletMap.put(value,tripletMap.get(value)+1);
                 count++;
             }
         }
     }

     return  count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr.add(arrItem);
        }

        long ans = countTriplets(arr, r);

        System.out.println(String.valueOf(ans) + "\n");

        bufferedReader.close();
    }
}

/*
for(int i=0;i<arr.size();i++){
        for(int j=i+1;j<arr.size();j++){
        if(arr.get(j) == arr.get(i)*r){
        for(int k = j+1 ;k<arr.size();k++ ){
        if(arr.get(k) == arr.get(j)*r){
        count++;
        }
        }
        }
        }
        }*/
