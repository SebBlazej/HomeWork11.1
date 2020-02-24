package rightpersons.app;

import rightpersons.model.person.Person;
import rightpersons.model.person.exception.IncorrectAgeException;
import rightpersons.model.person.exception.NameUndefinedException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class PersonDataScanner {

    private static final Scanner SCANNER = new Scanner(System.in).useLocale(Locale.US);

    public Person getPerson() {
        Person person = new Person();
        getDataOf(person);

        return person;
    }

    private void getDataOf(Person person) {
        System.out.println("Wczytaj dane osoby.\n");
        setFirstName(person);
        setLastName(person);
        setAge(person);
        setPesel(person);
    }


    private void setFirstName(Person person) {
        boolean validValueFlag = false;
        String firstName;
        while (!validValueFlag) {
            try {
                System.out.println("Podaj imie:");
                firstName = SCANNER.nextLine();
                person.setFirstName(firstName);
                validValueFlag = true;
            } catch (InputMismatchException | NameUndefinedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void setLastName(Person person) {
        boolean validValueFlag = false;
        String lastName;
        while (!validValueFlag) {
            try {
                System.out.println("Podaj nazwisko:");
                lastName = SCANNER.nextLine();
                person.setLastName(lastName);
                validValueFlag = true;
            } catch (InputMismatchException | NameUndefinedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void setAge(Person person) {
        boolean validValueFlag = false;
        int age;
        while (!validValueFlag) {
            try {
                System.out.println("Podaj wiek:");
                age = SCANNER.nextInt();
                person.setAge(age);
                validValueFlag = true;
            } catch (IncorrectAgeException ageExec) {
                System.out.println(ageExec.getMessage());
            } catch (InputMismatchException inputExec) {
                System.out.println("Błędny rodzaj danych.");
            } finally {
                SCANNER.nextLine();
            }
        }
    }

    private void setPesel(Person person) {
        boolean validValueFlag = false;
        long pesel;
        while (!validValueFlag) {
            try {
                System.out.println("Podaj pesel:");
                pesel = SCANNER.nextLong();
                person.setPesel(pesel);
                validValueFlag = true;
            } catch (InputMismatchException inputExec) {
                System.out.println("Błędny rodzaj danych.");
            } finally {
                SCANNER.nextLine();
            }
        }
    }
}
