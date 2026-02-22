package com.sanu;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "sanubar";
        char target =String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
            return false;
        }


        static boolean search (String str ,char target){
            if (str.isEmpty()) {
                return false;
            }

            for (int i = 0; i < str.length(); i++) {
                if (target == str.charAt(i)) {
                    return true;
                }
            }

            return false;


}
    }



