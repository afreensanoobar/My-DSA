

import java.util.Scanner;
public class maxElement {
    public static void main(String[] args) {
        System.out.println("Enter Size of Arr");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = new int [n];
         int max = arr[0];
         // or int max  = Integer.MIN_VALUE;
        System.out.println("Enter Arr Elements");
         for (int i = 0 ; i<n; i++){
              arr[i] = sc.nextInt();
              if (arr[i]>max) {
                 max = arr[i];
              }


         }
        System.out.print(max);
    }
}
