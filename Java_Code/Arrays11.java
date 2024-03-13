package com.september;

public class Arrays11 {
    public static void main(String[] args) {
        int [] a={45,89,78,34,33,67,90};
        for (int i=0;i<a.length;i++){
            if (i%2==0){
                System.out.println("Even index element: "+a[i]);
                System.out.println("----------------------------------");
            }

            else {
                System.out.println("Odd index element: "+a[i]);
                System.out.println("----------------------------------");
            }
        }

    }
}
