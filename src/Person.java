import java.io.*;

public class Person {
    //attributi
    public String name = "Alessandro";
    public String surname = "Ricordy"; //attributo dinamico
    public int age = 16;
    public static char gender = 'M'; //attributo statico
    private String cf = "RCRLSN09B18H501A";

    //costruttore
    public Person(int n){
        if(n == 1){ //modifica alcuni attributi se n == 1
            age += 1;
            gender = 'F'; //modifico gender per l'oggetto person1
            surname = "Ricordì"; //modifico surname per l'oggetto person1
        }
        else{
            age += 10;
        }
    }

    //metodo
    public String getCf(int userKey){
        int key = 1234;
        if(userKey == key){
            return cf;
        }
        else{
            return "wrong key";
        }
    }
}
