import java.util.ArrayList;
import java.util.Arrays;

public class MaxSubArray {
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
        int start = 0, end = 0;
        for(int i = 0 ; i< A.size();i++)
            if (A.get(i) > 0) {
                continue;
            } else {
                ArrayList<Integer> subList = (ArrayList<Integer>) A.subList(start, i - 1);
                arrList.add(subList);
                start = i + 1;
            }
        int[] sumList = new int[arrList.size()];
        for(int i =0;i<arrList.size();i++){
            sumList[i] = arrList.get(i).stream().mapToInt(x-> (int)x).sum();
        }

        int maxIndex = 0;
        int max = sumList[0];
        for(int i=1;i<sumList.length;i++){
            if(sumList[i]>max){
                max = sumList[i];
                maxIndex =i;
            }
        }
        return arrList.get(maxIndex);
    }


    public static void main(String[] args) {
       ArrayList<Integer> input = new ArrayList<>();
       input.add(1);
        input.add(2);
        input.add(5);
        input.add(-7);
        input.add(2);
        input.add(3);
       ArrayList<Integer> result = maxset(input);
        for (int val:result) {
            System.out.println(val);
        }
    }
}
