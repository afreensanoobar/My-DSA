

public class SearchInArray {
    public static void main(String[] args) {
      int[] arr ={12,23,34,45,67};
      int target = 23 ;
//      boolean flag = false;
//      for (int i =0;i<arr.length;i++){
//          if (arr[i] == target){
//          flag = true;
//          break;
//      }
//    }
//    if (flag) System.out.println("Target exists");
//    else System.out.println("TArget Missing");
        int found = -1; // means target iss noy ij  array
        for(int i =0; i< arr.length ; i++){
            if (arr[i] == target) {
                found = i;
                break ;
            }
        }
        if (found != -1) System.out.println("Target exist at index" + found);
        else System.out.println("Targget exists");

}
}
