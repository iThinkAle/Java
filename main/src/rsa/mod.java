package rsa;

public class mod {
    public String mani() throws ArithmeticException{

        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int n = (int) (Math.random() * 100);

        /*int a = 15;
        int b = 3;
        int n = 12;*/

        int x = a - b;

        while(x % n != 0){
            System.out.println(a);
            System.out.println(b);
            System.out.println(n);
            a = (int) (Math.random() * 100);
            b = (int) (Math.random() * 100);
            n = (int) (Math.random() * 100);

            x = a - b;
        }
        System.out.println(x + " " + n);
        System.out.println(a + " congruo a " + b + " modulo " + n);

        return a + " congruo a " + b + " modulo " + n;
    }

    public static void main(String[] args) throws ArithmeticException {
        mod main = new mod();

        main.mani();
    }
}
