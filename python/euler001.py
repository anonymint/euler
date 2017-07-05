"""
Project Euler #1: Multiples of 3 and 5

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000000000.

"""

def arithmetic_plus_series(n):
    return n * (n + 1) // 2


def solution(_input):
    _input = _input - 1
    return int(3 * arithmetic_plus_series(_input // 3) +
               5 * arithmetic_plus_series(_input // 5) -
               15 * arithmetic_plus_series(_input // 15))


if __name__ == '__main__':
    print(solution(1000000000))
