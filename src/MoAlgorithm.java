import java.util.Arrays;

public class MoAlgorithm {

    public static void main(String args[]){
        Long[] Arr = {1L,5L,3L,2L,1L,6L,2L,1L,10L,11L};
        Long[] queue = {5L,1L,7L};
        solve(Arr,queue);
    }

    static void solve(Long[] Arr, Long[] Queue){
        int leftCount = 0;
        int rightCount = 0;
        for(Long q : Queue){
            int index  =  q.intValue();
            for(int i=1;i <=index; i++){
                if(Arr[i-1] < Arr[index-1]){
                    leftCount++;
                }
            }
            for(int j=index; j<Arr.length;j++){
                if(Arr[j] > Arr[index-1]){
                    rightCount++;
                }
            }
            System.out.println(leftCount + " " + rightCount);
            leftCount = 0;
            rightCount = 0;
        }
    }
}
