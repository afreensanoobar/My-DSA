
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String s = "Afreen";
        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
        int i=0,  j=sb.length()-1;
        while(i<=j) {
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i , temp2);
            sb.setCharAt(j , temp1);
            i++;
            j--;
        }
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);//time complexity O(n)
    }

}

// if we want to reverse again make it string
//s = sb.toString();
//System.out.print(s)//it will print s string
