package rightpersons.app;

import rightpersons.model.person.Person;

import java.util.Locale;
import java.util.Scanner;

public class PersonDataLoader {

    private static final Scanner SCANNER = new Scanner(System.in).useLocale(Locale.US);

    public Person getPerson(){
        return scanData();
    }

    private Person scanData() {
        System.out.println("Wczytaj dane osoby.\n");
        String firstName = getFirstName();
        String lastName = getLastName();
        int age = getAge();
        long pesel = getPesel();

        return new Person(firstName, lastName, age, pesel);
    }


    private String getFirstName(){
        System.out.println("Podaj imie:");
        return SCANNER.nextLine();
    }

    private String getLastName() {
        System.out.println("Podaj nazwisko:");
        return SCANNER.nextLine();
    }

    private int getAge(){
        System.out.println("Podaj wiek:");
        int age = SCANNER.nextInt();
        SCANNER.nextLine();
        return age;
    }

    private long getPesel(){
        System.out.println("Podaj pesel:");
        long pesel = SCANNER.nextLong();
        SCANNER.nextLine();
        return pesel;
    }
}
