package temp;

/*

*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();

        String[] nomi = {};
        int SIZE = nomi.length;

        for(int i = 0; i < 8; i++) {
            for(int j = 1; j <= 2; j++) {
                int randInt = rand.nextInt(SIZE);
                System.out.println(nomi[randInt]);

                nomi[randInt] = nomi[SIZE - 1];
                SIZE--;
            }
            System.out.print(tastiera.readLine());
        }
    }
}
