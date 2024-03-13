package com.september;

import java.util.Scanner;

public class Sum_Of_Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int sum_even=0;
        int sum_odd=0;
        for (int i=1;i<=n;i++){
            if (i%2*i==0){
//            if (i%2==0){
                sum_even+=i;
                System.out.println("The sum of even : "+sum_even);
            }else {
                sum_odd+=i;
                System.out.println("The sum of odd: "+sum_odd);
            }
        }
    }
}
