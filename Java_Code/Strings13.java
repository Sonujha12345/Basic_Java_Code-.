package com.september;

public class Strings13 {
    public static void main(String[] args) {
//        StringBuffer s1=new StringBuffer("Java");
//        System.out.println(s1);
//
//        StringBuilder s=new StringBuilder("Hello Java");
//        System.out.println(s);

//        String s=new String("Hello java program");
//        StringBuilder s1=new StringBuilder(s);
//        for (int i=0;i<s1.length();i++){
//            System.out.print(s1.charAt(i));
//    }
//        String s="java hello";
//        StringBuffer s1=new StringBuffer(s);
//        System.out.println(s1);

//        String s=new String("Java ");
//        StringBuffer s1=new StringBuffer(s);
//        System.out.println(s1.append("Program"));

//        StringBuffer s=new StringBuffer("Hello java");
//        String s1= String.valueOf(s);
//        System.out.println(s1);

//        StringBuilder s=new StringBuilder("Hello java");
//        String s1=new String(s);
//        System.out.println(s1);

//        String s="helloarerryy";
//        String s1=" ";
//        for (int i=0;i<s.length();i++){
//            if (!(s1.contains(s.charAt(i)+""))){
//                s1=s1+s.charAt(i);
//            }
//        }
//        System.out.println(s1);

        //subString convert in java....
        String s="helloarerryy";
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }

    }
}
