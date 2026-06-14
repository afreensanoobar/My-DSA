package Sanu;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base");
        int a = sc.nextInt();
        System.out.println("Enter Number");
        int b = sc.nextInt();
        System.out.println(a + "  raised to power " + b + " is " + pow(a,b));
    }
//public static int pow(int a , int b){
//        if(b==0) return 1;
//        if (b%2==0) return pow(a,b/2)*pow(a,b/2);
//        else return a*pow(a,b/2)*pow(a,b/2);
//calling fun one time only
public static int pow(int a , int b){
      if(b==0) return 1;
      int call = pow(a,b/2);
       if (b%2==0) return call*call;
        else return a*call*call;
}

}
