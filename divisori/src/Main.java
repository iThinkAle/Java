//memory optimized program for long integers

package src;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        long n = 0L;

        System.out.println("Inserisci un numero");
        try{
            n = Long.parseLong(tastiera.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Inserisci numero valido");
            return;
        }

        List<Long> divs = new ArrayList<>();

        long rad = (long) Math.sqrt(n);

        /*
          everything works more efficiently thanks to math property of divisors.
          instead of doing one cycle to compute divisors from 1 to n (it would be much slower for bigger numbers), we divide the
          computation into two cycles.
          one cycle goes from 1 to sqrt(n). this works because every i divisor of n has a complementary divisor n/i, so to compute every divisor
          we can go from 1 to only sqrt(n), because using that we can already get every divisor.
          second cycle is optional. it goes from rad to n to compute divisors bigger than sqrt(n) and
          backwards to add them to the dynamic array in crescent order.
         */

        //cycle for numbers from 1 to rad
        for(long i = 1; i <= rad; i++){
            if(n % i == 0){
                divs.add(i);
            }
        }

        //cycle for numbers from rad to n. reversed to add them to divs in crescent order
        for(long i = rad; i >= 1; i--){
            if(n % i == 0 && n/i != i){
                divs.add(n/i);
            }
        }

        if(divs.size() == 2){
            System.out.println("Il numero è primo");
        }
        else{
            System.out.println("Il numero ha " + divs.size() + " divisori");
        }

        for(int i = 0; i < divs.size(); i++){
            System.out.print(divs.get(i) + " ");
        }
        System.out.println();



    }
}