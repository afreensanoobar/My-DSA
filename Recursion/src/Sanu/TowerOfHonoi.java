package Sanu;

public class TowerOfHonoi {
    public static void main(String[] args) {
        honoi(3,'A','B','C');
    }
    private static void honoi(int n , char a , char b , char c){
        if (n==0) return ;
        honoi(n-1, a, c, b);//n-1 disks from a to b via c
        System.out.println(a+"->"+c);//largest from a to c
        honoi(n-1,b,a,c);//n-1 disks from b to c via a
    }
}
