package rsa;

public class mathOps {
    public boolean coprimes(long a, long b){
        int divisors = 0;
        long max = Math.max(a, b);

        for(int i = 1; i <= max; i++) {
            if(a % i == 0 && b % i == 0) {               //if a and b share divisors
                divisors++;
            }
        }
        return divisors <= 1;                           //return true if they share only one divisor (gcd(a,b) == 1). num and denomin of a reduced frac are coprime
    }


    public int euler_totient(long n) {
        int coprimes = 0;                        //n is the number we're trying to get coprimes of.

        for(long x = 1; x <= n; x++){                    //x is a potential coprime of n we’re trying to find.
            long j;
            for(j = 2; j <= n; j++){                    //j is a potential divisor of both n and x. coprimes (n and x, potentially) do not share divisors besides 1 and -1.
                if(n % j == 0 && x % j == 0){           //is j a divisor of both n and x?
                    break;                              //if yes, x is not coprime to n. exit the cycle early and move on to the next x.
                }
            }
            if(j == n + 1){                             //if cycle finishes normally, j was not a divisor of neither n nor x. this means that x is a coprime of n.
                coprimes++;
            }
        }
        return coprimes;
    }


    public boolean modulo(long a, long b, long n){
        long x = a - b;

        if(x == 0) {
            throw new ArithmeticException();
        }

        return x % n == 0;
    }


    public static void main(String[] args) {
        mathOps m = new mathOps();

        System.out.println(m.coprimes(4, 3));
    }
}