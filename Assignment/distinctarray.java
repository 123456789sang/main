
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class distinctarray {
    public static boolean distinctElement(int num[]){
        //   for (int i=0;i<num.length;i++) { 
        //         for (int j=i+1;j<num.length;j++) { //brute force O(n*n)
        //            if (num[i]==num[j]) {
        //               return true;
        //            }
        //         }   
        //} 
        // 2- method (nlog n)
        // Arrays.sort(num);
        // for (int i = 0; i < num.length-1; i++) {
        //    if (num[i]==num[i+1]) {
        //        return true;
        //    }
        // }
        Set<Integer>set=new HashSet();
        for (int i = 0; i < num.length; i++) {
            if (set.contains(num[i])) {
                return true;
            }
            set.add(num[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr []={1,2,3,4};
       
        System.out.println (distinctElement(arr));
    }
}
