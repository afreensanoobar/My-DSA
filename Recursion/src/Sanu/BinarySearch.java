package Sanu;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums ={1, 2 , 3 , 6 , 8 , 78, 87};
        int target=10;
        int ans = search(nums, target);
        System.out.println("Taget found at index" + ans);

    }
        public static int helper ( int[] nums, int target, int lo, int hi){
            if (lo > hi) return -1;
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) return helper(nums, target, lo, mid - 1);
            else return helper(nums, target, mid + 1, hi);
        }

        public static int search ( int[] nums, int target){
            int n = nums.length;
            return helper(nums, target, 0, n - 1);
        }
    }

