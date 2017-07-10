/**
 * Project Euler #2: Even Fibonacci numbers
 * <p>
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1  and  2, the first  terms will be:
 * 1,2,3,5,8,13,21,34,55,89,...
 * *
 * <p>
 * By considering the terms in the Fibonacci sequence whose values do not exceed , find the sum of the even-valued terms.
 */
public class euler002 {

    private static long solution(int n) {
        if (n < 2)
            return 0;
        long buffer = 1;
        long current = 1;
        long count = 0;
        while (current < n) {
            long temp = current + buffer;
            if (temp < n && temp % 2 == 0)
                count += temp;
            buffer = current;
            current = temp;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 100000; // result for 100000 == 60696
        long result = solution(n);
        System.out.println(String.format("sum of even number from 1 to %d is %d", n, result));
    }
}
