/**
 * Project Euler #3: Largest prime factor
 * <p>
 * The prime factors of 13195 are 5,7,13 and 29. so in this case 29
 * <p>
 * What is the largest prime factor of a given number ?
 */
public class euler003 {

    private static long solution(long input) {
        while (true) {
            long minPrime = primeDivider(input);
            if (minPrime < input) {
                input = input / minPrime;
            } else {
                return minPrime;
            }
        }
    }

    private static long primeDivider(long n) {
        if (n <= 1) return 1;
        if (n == 2 || n % 2 == 0) return 2;
        for (long i = 3; i < Math.sqrt(n) + 1; i = i + 2) {
            if (n % i == 0) return i;
        }
        return n;
    }

    public static void main(String[] args) {
        long input = 4007972729l;
        long result = solution(input);
        System.out.println(result);
    }
}
