

public class SecondLargest {
    public static void main(String[] args) {
        int []arr= {4, 6 , 7 ,8, 9};
        int max =Integer.MIN_VALUE;
        int smax= Integer.MIN_VALUE;
        //max
        for (int i =0 ; i<arr.length;i ++){
            if (arr[i]>max) max = arr[i];
        }
        //sec max
        for (int i =0 ; i<arr.length;i ++){
            if (arr[i] >smax && arr[i]!=max) smax = arr[i];

        }
        System.out.println(smax);
    }

}
