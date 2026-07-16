// import java.util.Scanner;
// public class function {



    //   ex 1 multiply two numbers and print the product
//     public static void multiply(int a , int b) {
//         int product =a*b;
//         System.out.println(product);
            

//     }

//     public static void main(String[] args) {
//         multiply(5,6);}

//    ex 2:- binomial expansion nCr = n!/r!*(n-r)!
// public static int fac(int n){
//     int f=1;
//     for (int i=1 ;i<=n;i++){
//         f=f*i;
//     }
//     return f;
// }

// public static int demo( int m, int r){
//     int a = fac(m);
//     int b = fac(r);
//     int c = fac(m-r);
//     int ncr = a/(b*c);
//     return ncr;
// }   
// public static void main(String[] args) {
//     int m = 5;
//     int r = 2;
//     int ans = demo(m,r);
//     System.out.println(ans);

// //check no. isprime or not in the range of 1 to 100
// public static boolean isprime (int n) {
//     if (n<=1){
//         return false;
//     }
//     for (int i = 2 ; i<=Math.sqrt(n);i++){
//      if (n%i==0){
//         return false;
//      }
//     }
//      return true;


// }
// public static void inrange(int a, int b){

//     int count = 0;
//     for (int i =a; i<=b;i++){
//         if(isprime(i)){
//             System.out.println(i);
//             count++;
//         }
//     }
//     System.out.println("Count of prime numbers: " + count);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the range (two integers for range):");
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     sc.close();
//     inrange(a, b);
// // }
// // binary to decimal conversion
//  public static void bintodc(int n){
//     int ld=0;
//     int pow=0;
//     int dec=0;
//     while (n>0) {
//         ld=n%10;
//         dec = dec + ld*(int)Math.pow(2,pow);
//         pow++;
//         n=n/10;
//     } 
//     System.out.println(dec);
//  }
//  public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//      sc.close();
//      bintodc(n);
//  }
 // decimal to binary conversion
//  public static void decimalToBinary(int n){
//     int rem=0;
//     int pow=0;
//     int bin=0;
//     while (n>0) {
//         rem=n%2;
//         bin = bin + rem*(int)Math.pow(10,pow);
//         pow++;
//         n=n/2;
//     } 
//     System.out.println(bin);
//  }
//  public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//      sc.close();
//      decimalToBinary(n);
//  }
// }






