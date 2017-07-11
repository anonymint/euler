"""
Project Euler #3: Largest prime factor

The prime factors of 13195 are 5,7,13 and 29. so in this case 29

What is the largest prime factor of a given number ?

"""
import math

def solution(n):
    min_p = get_min_prime_divider(n)
    if min_p == n:
        return n
    else:
        n = n // min_p
        return solution(n)


def get_min_prime_divider(n):
    if n == 2 or n % 2 == 0:
        return 2
    if n <= 1:
        return 1
    for i in range(3, int(math.sqrt(n) + 1), 2):
        if n % i == 0:
            return i

    return n


if __name__ == '__main__':
    # prime 4007972729 so biggest prime divide is itself
    print(solution(4007972729))
