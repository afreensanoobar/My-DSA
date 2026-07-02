import java.util.Scanner;
import java.util.Arrays;
public class waveArray {

    public static void sortInWave(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
Arrays.sort(arr);
        sortInWave(arr);

        System.out.println("Wave Array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}