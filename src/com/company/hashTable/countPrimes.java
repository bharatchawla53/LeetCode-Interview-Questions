package com.company.hashTable;

public class countPrimes {
    public static void main(String[] args) {
        int n  = 10;
        System.out.println(cPrimes(n));
    }

    /*
        Sieve of Eratosthenes is one of the most
        efficient ways to find all primes smaller than n.
     */
    private static int cPrimes(int n) {
        boolean[] prime = new boolean[n+1];
        int count = 0;
        for (int i = 0; i < n; i++){
            prime[i]= true;
        }
        for (int p = 2; p*p <= n; p++) {
            if (prime[p] && p*p <= n) {
                //update all multiple of p
                for (int i = p*p; i <=n; i+=p) {
                    prime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        return count;
    }
}
