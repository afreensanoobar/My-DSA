

public class OddEvenIndexMul {
    public static void main(String[] args) {
        int [] arr ={ 10, 40, 89, 90};
        print(arr);
        for (int i=0;i<arr.length;i++){
            if (i%2==1) arr[i]*=2;
            if (i%2==0) arr[i]*=10;
        }
        print (arr);
}
public static void print(int[] arr){
    for (int i=0;i<arr.length;i++) {
        System.out.print(arr[i] + " ");
    }
    }
}
