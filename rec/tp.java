public class tp {
    public static int ways(int n){
        if (n==0 || n==1){
            return 1;
        }
        return ways(n-1)+ ways(n-2);
        // // full code
        // // horizotal choice
        // int fnm1= ways(n-1);
        // // vertical choice
        // int fnm2= ways(n-2);
        // int total = fnm1 + fnm2;
        // return total;
    }
    public static void main(String[] args) {
        System.out.println(ways(3));
    }
}
