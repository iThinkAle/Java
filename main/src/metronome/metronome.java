package metronome;

public class metronome {
    public static void main(String[] args) throws InterruptedException {
        long i = 1;

        int tempo = 120;

        long interval = 60000 / tempo;

        while (true) {
            System.out.println(i++);
            Thread.sleep(interval);
            if(i == 5){
                System.out.println();
                i = 0;
            }
        }
    }
}
