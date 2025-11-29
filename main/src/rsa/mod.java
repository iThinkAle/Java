package rsa;

public class mod {
    public int a = 5;
    public int m = 12;

    public void congruenzaModulo(){
        int a = 8;
        int b = 2;
        int n = 2;

        int x = a - b;

        if(x == 0) {
            throw new ArithmeticException();
        }

        if(x % n == 0){
            System.out.println(x + " " + n);
            System.out.println(a + " congruo a " + b + " modulo " + n);
        }

    }

    public int modulo(){
        int mod = a % m;

        return mod;
    }

    public int inverseModulo(){
        //extended euclidean algorithm
        int x;
        for(x = 0; x < m; x++){
            if((a*x) % m == 1){
                break;
            }
        }
        return x;
    }


    public static void main(String[] args) throws ArithmeticException {
        mod mod = new mod();

        //mod.congruenzaModulo();

        System.out.println(mod.modulo());

        System.out.println(mod.inverseModulo());


    }
}
