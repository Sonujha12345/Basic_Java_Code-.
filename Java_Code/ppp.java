package com.september;

public class ppp {
    public static void main(String[] args) {
        int n=10;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            for (int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for ( int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }




//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=10;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int spc=2*(n-i);
//            for (int j=1;j<=spc;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int spc=2*(n-i);
//            for (int j=1;j<=spc;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                int sum=i+j;
//                if (sum%2==0){
//                    System.out.print(" 1 ");
//                }
//                else {
//                    System.out.print(" 0 ");
//                }
//            }
//            System.out.println();
//        }



//        int num=1;
//        for (int i=1;i<=n;i++){
//            for (int j=1; j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }


//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        for (int i=1; i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//         for (int i=n;i>=1;i--){
//            for (int j=1 ;j<=i;j++){
//                System.out.print("*");
//            }
//             System.out.println();
//         }

//        for (int i=1;i<n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        int m=7;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=m;j++){
//                if (i==1||j==1||i==n||j==m){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        for (int i=1;i<=n;i++){
//            for (int j=1; j<=m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}



