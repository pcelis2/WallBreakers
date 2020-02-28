public class Pow_DP {
    public static void main(String[] args) {
        Pow_DP dp = new Pow_DP();
        System.out.println(dp.myPow(2, 3));

        for (int i = 0; i < 100; i++) {
            int j = i;
            System.out.printf("%3d| ", j);
            while (j > 0) {
                j = j / 2;
                System.out.printf("%2d ", j);
            }
            System.out.println();
        }

    }

    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        double solution = n > 0 ? x : (1 / x);
        int size = Math.abs(n);
        for (int i = 2; i < size; i = i * 2) {
            if (i % 2 == 0)
                solution = solution * solution;
            else {
                if (n < 0)
                    solution = solution * solution * 1 / x;
                else
                    solution = solution * solution * x;
            }
        }
        return solution;
    }
}