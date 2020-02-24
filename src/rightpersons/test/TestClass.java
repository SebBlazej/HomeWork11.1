package rightpersons.test;

import rightpersons.app.PersonDataScanner;
import rightpersons.model.person.Person;

public class TestClass {


    public static void main(String[] args) {

        PersonDataScanner personDataScanner = new PersonDataScanner();

        Person person = personDataScanner.getPerson();
        System.out.println(person.toString());

    }
}
