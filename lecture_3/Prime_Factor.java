package lecture_3;

import java.util.*;

public class Prime_Factor {
    static int SumPrime(long n) {
        int i = 2;
        int sum = 0;
        while (n != 1) {
            if (n % i == 0) {
                n = n / i;
                sum += i;
            } else {
                i++;
            }
        }
        return sum;
    }

    static int digit(long n) {
        int sum = 0;
        while (n != 0) {
            int b = (int) n % 10;
            sum += b;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;

        do {
            n = sc.nextLong();
        } while (n <= 1 || n >= 2_147_483_647);

        int sumPrime = SumPrime(8);
        int sumDigits = digit(n);

        System.out.println("SumPrime(n): " + sumPrime);
        System.out.println("SumDigits(n): " + sumDigits);

        if (sumPrime == sumDigits) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
        System.out.println(sumPrime);
    }
}
