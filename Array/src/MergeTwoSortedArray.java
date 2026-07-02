

import java.util.*;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Enter Array 1 size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array1");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Array 2 size");

        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter array2");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[a.length + b.length];
        for (int ele : c) {
            System.out.print(ele + " ");

        }
        System.out.println();
        merge ( a , b , c );
        for (int ele: c) System.out.println(ele + " ");
    }

    public static void merge (int[] a , int[] b , int [] c){
        int i=0 , j=0, k=0;
        while (i<a.length&& j< b.length){
            if (a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]= b[j++];
    }
}
