
public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int [] arr = {1 ,0 , 9, 0, 8, 0, 6, 2};

        for (int ele:arr)  System.out.print(ele + " ");

        System.out.println(" ");
        pushZeroesToEnd(arr);
        for (int ele:arr)  System.out.print(ele + " ");
    }
    public static void pushZeroesToEnd(int[] arr){
        int n = arr.length;
        int j =0;
        for (int i =0; i<n; i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;

                }
                j++;
            }
        }
    }


}
