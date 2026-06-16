package Sanu;

public class uniquePath {

    public static int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        return uniquePaths(m, n - 1) + uniquePaths(m - 1, n);
    }


    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        System.out.println(uniquePaths(m, n));
    }

}