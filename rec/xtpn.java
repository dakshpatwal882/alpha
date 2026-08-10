public class xtpn {
    // public static int powern(int x , int n){
    //     if (n==0)
    //     {
    //         return 1;
    //     }
    //       int halfpower = powern(x,n/2);
    //      int halfpowersq= halfpower * halfpower;
    //     if(n%2!=0){
    //          halfpowersq = x* halfpowersq;
    //     } return halfpowersq;
    // }
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return power(x, N);
    }
    private double power(double x, long n) {
        if (n == 0) return 1;
        double half = power(x, n / 2);
        double ans = half * half;
        if (n % 2 == 1) {
            ans *= x;
        }
        return ans;
    }
    public static void main(String[] args) {
        xtpn obj = new xtpn();
        System.out.println(obj.myPow(5, 2));
    }
}
