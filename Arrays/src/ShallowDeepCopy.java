import java.util.Arrays;

public class ShallowDeepCopy {
    public static void main(String[] args) {
        int a = 4;// 4 bytes
        int [] arr = {3, 4, 5, 67};//16 bytes
        int [] x = arr; // x is the shallow copy of arr
        x[0]= 100;

        int [] y = Arrays.copyOf(arr , arr.length);// deep copy
        y[0] = 89  ;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
