import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class PrimeSum {
    public static ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int[] primes = new int[A+1];
        for(int i=0; i<A;i++){
            primes[i] = 1;
        }
        primes[0] = 0;
        primes[1] = 0;
        for(int i=2; i< Math.sqrt(A) ; i++){
            if(primes[i]==1){
                for(int j=2 ; i*j <A ; j++){
                    primes[i*j]=0;
                }
            }
        }
        Hashtable<Integer, Integer> pairs = new Hashtable<>();
        int min= Integer.MAX_VALUE;
        for(int i=2;i<=A/2;i++){
            if(primes[i]==1 & primes[A-i]==1){
                pairs.put(i,A-i);
            }
        }
        for(Map.Entry<Integer, Integer> x: pairs.entrySet()) {
            if (x.getKey() < min) {
                min= x.getKey();
            }
        }
        if(min != Integer.MAX_VALUE){
            result.add(min);
            result.add(pairs.get(min));
        }
        return result;
    }

    public static  void main(String args[]){
        ArrayList<Integer> result = new ArrayList<>();
        result = primesum(4);
        for(int val : result){
            System.out.println(val +" ");
        }
    }
}

