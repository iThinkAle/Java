//not memory optimized program only for short integers

package src;

import java.io.*;

class MainInt{
    public static void main(String[] args) {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;

        System.out.println("Inserisci un numero");
        try{
            n = Integer.parseInt(tastiera.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Inserisci numero valido");
            return;
        }

        int[] ris = new int[n];
        int j = 0; //actual for cycle index for array value assignment

        for(int i = 1; i <= n; i++){
            float temp = n % i;
            if(temp == 0){
                ris[j] = i;
                j++;
            }
        }

        if(j == 2){
            System.out.println("Il numero è primo");
        }
        else{
            System.out.println("Il numero ha " + j + " divisori");
        }

        for(int i = 0; i < j; i++){
            System.out.print(ris[i] + " ");
        }
        System.out.println();
    }
}