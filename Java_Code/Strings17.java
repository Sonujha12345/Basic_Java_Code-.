package com.september;
import java.util.Arrays;
public class Strings17 {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String s3=new String(c1);
        String s4=new String(c2);
        if (s3.equals(s4)){
            System.out.println("anagrams");
        }else {
            System.out.println("not anagrams");
        }
    }
    }

