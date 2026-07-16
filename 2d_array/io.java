import java.util.*;
class io {
    public static void main(String[] args) {
        int m;
        int n;   
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter no. of rows:-");
        m = sc.nextInt();
        System.out.println(" enter no. of coloums:-");
        n = sc.nextInt();
        int num [][] =  new int[m][n];     
        for(int i=0 ; i<m ; i++) {

             for(int j=0 ; j<n ; j++) 
             {
                
                 System.out.println(" enter elements");
                num[i][j]= sc.nextInt();
             }
        }
         sc.close();
          System.out.println("output is:-");

          for(int i=0 ; i<m ; i++) {
           
             for(int j=0 ; j<n ; j++) 
             {
               System.out.print(num [i][j] + " ");
             }System.out.println();
        }
    }





}