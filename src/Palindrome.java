import java.math.BigInteger;
import java.util.ArrayList;

public class Palindrome {
    public static  int isPalindrome(int A) {
        ArrayList<Integer> result = new ArrayList(6);

        int number = A;
        while(number>0){
            result.add(number%10);
            number=number/10;
        }
        StringBuilder sb = new StringBuilder();
        for(int val : result){
            sb.append(val);
        }
        if(A >= 0 && Long.parseLong(sb.toString().trim()) == A){
            return 1;
        }
        return 0;
    }


    public static  void main(String args[]){
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println(isPalindrome(0));
    }
}
