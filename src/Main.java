public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(1); //person1 triggera le modifiche agli attributi
        Person person2 = new Person(2); //3 oggetti per la classe Person
        Person person = new Person(0);

        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println(person.getCf(123));
        System.out.println(person.getCf(1234));

        //gender può essere solo richiamato con il nome della classe e non con quello degli oggetti, essendo statico
        System.out.println(Person.gender); //gender anche se dichiarato M è stato modificato in F per l'oggetto person1, quindi essendo statico sarà così per tutti gli altri oggetti della classe
        Person.gender = 'F';
        System.out.println(Person.gender);
        Person.gender = 'M';
        System.out.println(Person.gender);

        System.out.println(person1.surname); //anche se surname è stato modificato per person1, resta lo stesso dell'inizio per person2 e gli altri oggetti della classe
        System.out.println(person2.surname);
    }

}
