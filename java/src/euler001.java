/**
 * Project Euler #1: Multiples of 3 and 5
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000000000.
 */
public class euler001 {

    private static long solution(long input) {
        // n + 2n+ 3n + ... + xn ==> n(1+2+3...+x) == > n(x)(x+1)/2
        input--; // inclusive
        long sum3 = 3 * (input / 3) * (input / 3 + 1) / 2;
        long sum5 = 5 * (input / 5) * (input / 5 + 1) / 2;
        long sum15 = 15 * (input / 15) * (input / 15 + 1) / 2;
        return sum3 + sum5 - sum15;
    }

    public static void main(String[] args) {

        long result = solution(1_000_000_000);
        System.out.println(result); // has to be 233333333166666668
    }
}
