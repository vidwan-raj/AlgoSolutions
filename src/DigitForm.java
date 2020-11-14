import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;

public class DigitForm {
    public static  int solve(ArrayList<Integer> A, int B, int C) {
        int counter = 0;
        for(int i=0;i<A.size();i++){
            for(int j=i+1;j<A.size();j++){
                StringBuilder sb = new StringBuilder();
                sb.append(A.get(i));
                sb.append(A.get(j));
                if(Integer.parseInt(sb.toString()) < C){
                    counter++;
                }
            }

        }
        return counter;
    }

    public static  void main(String args[]){
       System.out.println(solve(new ArrayList<>(asList(0,1,5)), 1, 2));
    }
}
