import java.util.Scanner;

public class SegregateZerosAndOnes{

    static void segregate0and1(int[] arr) {
        int numOfZeros = 0;
        int numOfOnes = 0;
        // Count zeros and ones
        for (int ele : arr) {
            if (ele == 0)
                numOfZeros++;
            else
                numOfOnes++;
        }

        // Fill zeros
        for (int i = 0; i < numOfZeros; i++) {
            arr[i] = 0;
        }

        // Fill ones
        for (int i = numOfZeros; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements (only 0 and 1):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        segregate0and1
                (arr);

        System.out.println("Array after segregation:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
} 