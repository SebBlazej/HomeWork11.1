package rightpersons.test;

import rightpersons.app.PersonDataLoader;
import rightpersons.model.person.Person;

public class TestClass {


    public static void main(String[] args) {

        PersonDataLoader personDataLoader = new PersonDataLoader();

        Person person = personDataLoader.getPerson();
        System.out.println(person.toString());

    }
}
