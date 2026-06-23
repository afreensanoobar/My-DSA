
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        System.out.println("Enter Size of array");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr  = new int[n];
        int mul=1;
//        int sum =0;
        System.out.println("Enter Array");
        for (int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            //sum
//            sum = sum +arr[i];
            mul = mul* arr[i];
        }
        System.out.println(mul);
    }
}
