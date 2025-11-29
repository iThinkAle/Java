package rsa;

public class euler_totient {
    public int euler_totient(int n) {
        int coprimes = 0;                        //n is the number we're trying to get coprimes of.

        for(int x = 1; x <= n; x++){                    //x is a potential coprime of n we’re trying to find.
            int j;
            for(j = 2; j <= n; j++){                    //j is a potential divisor of both n and x. coprimes (n and x, potentially) do not share divisors besides 1 and -1.
                if(n % j == 0 && x % j == 0){           //is j a divisor of both n and x?
                    break;                              //if yes, x is not coprime to n. exit the cycle early and move on to the next x.
                }
            }
            if(j == n + 1){                             //if cycle finishes normally, j was not a divisor of neither n nor x. this means that x is a coprime of n.
                System.out.println(x);
                coprimes++;
            }
        }
        return coprimes;
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int max = Math.max(a, b);

        for(int i = 1; i <= max; i++) {
            if(a % i == 0 && b % i == 0) {               //if a and b share divisors
                System.out.println(i);
            }
        }
        System.out.println();


        /*int n = 8, coprimes = 0;                        //n is the number we're trying to get coprimes of.

        for(int x = 1; x <= n; x++){                    //x is a potential coprime of n we’re trying to find.
            int j;
            for(j = 2; j <= n; j++){                    //j is a potential divisor of both n and x. coprimes (n and x, potentially) do not share divisors besides 1 and -1.
                if(n % j == 0 && x % j == 0){           //is j a divisor of both n and x?
                    break;                              //if yes, x is not coprime to n. exit the cycle early and move on to the next x.
                }
            }
            if(j == n + 1){                             //if cycle finishes normally, j was not a divisor of neither n nor x. this means that x is a coprime of n.
                System.out.println(x);
                coprimes++;
            }
        }
        System.out.println("coprimes: " + coprimes);*/
    }
}
