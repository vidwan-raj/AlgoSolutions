import java.util.ArrayList;

public class ReverseArray {
    public static void arrange(ArrayList<Integer> a) {
        int n =a.size();

        for(int i=0; i<n; i++){
            a.set(i, a.get(i) + (a.get(a.get(i)) % n)*n);
        }
        for(int i =0 ; i<n;i++){
            a.set(i,a.get(i)/n);
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(4);
        res.add(0);
        res.add(2);
        res.add(1);
        res.add(3);
        arrange(res);
        for(int val : res){
            System.out.println(val);
        }
    }
}
