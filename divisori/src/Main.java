//memory optimized program for long integers

package src;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        long n = 0L;

        //reads input from user
        System.out.println("Inserisci un numero");
        try{
            n = Long.parseLong(tastiera.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Inserisci numero valido");
            return;
        }

        //declares dynamic array "divs"
        List<Long> divs = new ArrayList<>();

        //calculates square root of n
        long rad = (long) Math.sqrt(n);

        /*
          everything works more efficiently thanks to math property of divisors.
          every i divisor of n has a complementary divisor n/i, so to compute every divisor of n we can go from 1 to only sqrt(n).
          this is very important to save computational power and time.

          therefore, we can use only one cycle that goes from 1 to sqrt(n).
          the only downside is that we would not have the divisors in crescent order, we would have to use a sorting algorithm.

          the second cycle is optional and is used to fix the sorting problem that would generate with the first.
          it computes divisors from sqrt(n) to n and adds them to the array in crescent order so it eliminates the
          need of sorting the array.
         */

        //measures elapsed time
        long start = System.nanoTime();

        //computes divisors of n from 1 to rad
        for(long i = 1; i <= rad; i++){
            if(n % i == 0){
                divs.add(i);
                System.out.println(i);
            }
        }

        System.out.println("--------------");

        //computes divisors of n from rad to n. reversed to add them to divs array in crescent order
        for(long i = rad; i >= 1; i--){
            if(n % i == 0 && n/i != i){
                divs.add(n/i);
                System.out.println(n/i);
            }
        }

        long end = System.nanoTime();

        //checks if n is prime
        if(divs.size() == 2){
            System.out.println("Il numero è primo");
        }
        else{
            System.out.println("Il numero ha " + divs.size() + " divisori");
        }

        //prints every divisor
        for(int i = 0; i < divs.size(); i++){
            System.out.print(divs.get(i) + " ");
        }

        System.out.println("\n");

        //prints elapsed time in nanoseconds, milliseconds and seconds
        System.out.println("Elapsed time: " + (end - start) + "ns");
        System.out.println("Elapsed time: " + ((end - start) / 1000000) + "ms");
        System.out.println("Elapsed time: " + ((end - start) / 1000000000) + "s");
    }
}