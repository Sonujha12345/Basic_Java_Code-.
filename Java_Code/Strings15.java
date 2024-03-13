package com.september;

public class Strings15 {
    public static void main(String[] args) {
        String s="Welcometojava";
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                if (s.substring(i,j).length()==3) {
                    System.out.println(s.substring(i,j));
                }
            }
                }
        String emp="";
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                if (s.substring(i,j).length()==3){
                    emp=emp+s.substring(i,j)+"";
//

                }
            }
        }
        String [] s1=emp.split(" ");
        java.util.Arrays.sort(s1);
        System.out.println(s1[0]);
        System.out.println(s1[s.length()]);




    }
}
