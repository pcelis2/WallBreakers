public class Pow_Recur {
    public static void main(String[] args) {

    }

    public double myPow(double x, int n) {

        if (n == 1)
            return x;
        if (n == -1)
            return 1 / x;
        if (n == 0)
            return 1;

        double HalfCompute = myPow(x, n / 2);
        if (n % 2 == 0)
            return HalfCompute * HalfCompute;
        else {
            if (n < 0)
                return HalfCompute * HalfCompute * (1 / x);
            return HalfCompute * HalfCompute * x;
        }

        // runtime error
        // if (n == 1) {
        // return x;
        // } else if (n == -1) {
        // return 1 / x;
        // } else if (n < 0) {
        // return (1 / x) * (1 / myPow(x, n + 1));
        // } else {
        // return x * (myPow(x, n - 1));
        // }
    }
}