import java.util.ArrayList;

public class GCD {
    public static  int gcd(int A, int B) {
        if(A==0 && B!=0){
            return B;
        }
        if(A!=0 && B==0){
            return A;
        }
        if (A == B){
            return A;
        }

        if(A > B){
            return gcd(A-B,B);
        }
        return gcd(A,B-A);
    }

    public static  void main(String args[]){
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println(gcd(36,60));
    }
}
