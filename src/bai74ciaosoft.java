public class bai74ciaosoft {
    public static void main(String[] args) {
        double x = 1;
        int n = 3;
        double sum = 1;
        double term = 1;
        for (int k = 1; k <= n; k++) {
            term = term * (-x * x) / (2 * k) * (2 * k + 1);
            sum += term;
        }
        System.out.println("S = " + sum);
    }
}
