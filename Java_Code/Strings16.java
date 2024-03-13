package com.september;

public class Strings16 {
    public static void main(String[] args) {
        String s="pprogram";
        for (int i=0;i<s.length();i++){
            String ch=s.charAt(i)+" ";
            if (s.substring(i+1).contains(ch)) {
//
                continue;
            }

            else {
                System.out.println(ch);
                break;
            }
        }
    }
}
