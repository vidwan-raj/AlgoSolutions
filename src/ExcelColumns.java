import java.util.Hashtable;

public class ExcelColumns {
    public static void main(String args[]){
        String column = "AB";

        char[] arr = column.toCharArray();
        int len = column.length()-1;
        Hashtable<Character, Integer> alpha = new Hashtable<>();
        int result =0;
        char c = 'A';
        for(int i=1;i<=26;i++){
            alpha.put(c,i);
            c= (char) (c + 1);
        }
        for(char curr : arr){
            int val= alpha.get(curr);
            result += val * Math.pow(26,len);
            len--;
        }
        System.out.println(result);
    }


}
