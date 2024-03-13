package com.september;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a numbers byte: ");
       /* byte b=sc.nextByte();
        System.out.println("the number is byte: "+b);
        System.out.println("Enter a numbers short: ");
        short s=sc.nextShort();
        System.out.println("The number is short: "+s);
        System.out.println("Enter a numbers int: ");
        int i=sc.nextInt();
        System.out.println("The number is int: "+i);
        System.out.println("Enter a numbers long: ");
        long l=sc.nextLong();
        System.out.println("The number is long: "+l);
        System.out.println("Enter a numbers float: ");
        float f=sc.nextFloat();
        System.out.println("The number is float: "+f);
        System.out.println("Enter a numbers double: ");
        double d=sc.nextDouble();
        System.out.println("The number is double: "+d);
        System.out.println("Enter a characters : ");
        char c=sc.next().charAt(0);
        System.out.println("The characters is char: "+c);
        System.out.println("Enter a boolean value: ");
        boolean o=sc.nextBoolean();
        System.out.println("The boolean value: "+o);


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers long");
        long l= sc.nextLong();
        byte b=(byte) l;
        short s=(short) l;
        int i=(int) l;
        float f= l;
        double d= l;
        char c=(char) l;
        System.out.println("byte "+b);
        System.out.println("short "+s);
        System.out.println("int "+i);
        System.out.println("float "+f);
        System.out.println("double "+d);
        System.out.println("char "+c);



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers1 float: ");
        float a=sc.nextFloat();
        System.out.println("Enter a numbers2 float: ");
        float b=sc.nextFloat();
        System.out.println("The sum of two number: "+(a+b));
        System.out.println("The sub of two number: "+(a-b));
        System.out.println("The mult of two number: "+(a*b));
        System.out.println("The div of two number: "+(a/b));
        System.out.println("The mod of two number: "+(a%b));


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println("Enter a number: ");
        int b=sc.nextInt();
//        boolean c=(a>b) ;
//            System.out.println("a is great than b :" + c);
//            System.out.println("b is great than a : " + b);

        if(a > b ){
            System.out.println("a is great than b :"+a);
        }else {
            System.out.println("b is great than a : "+b);
        }

        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name = sc.nextLine();
        System.out.println("Enter a age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a roll no : ");
        int roll_no = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a gender : ");
        char gender = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter a address : ");
        String address = sc.nextLine();
        System.out.println("Enter a phone_no : ");
        String phone_no = sc.nextLine();
        System.out.println("The name of student: "+name);
        System.out.println("The age of student: "+age);
        System.out.println("The roll_no of student: "+roll_no);
        System.out.println("The gender of student: "+gender);
        System.out.println("The address of student: "+address);
        System.out.println("The phone_no of student: "+phone_no);



    }
}
