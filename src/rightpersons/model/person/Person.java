package rightpersons.model.person;

import rightpersons.model.person.exception.PersonExceptions;

import static rightpersons.model.person.exception.PersonExceptions.*;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private long pesel;

    public Person(String firstName, String lastName, int age, long pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    private void setAge(int age){
        validateAge(age);
        this.age = age;
    }

    private void setFirstName(String firstName){
        validateName(firstName);
        this.firstName = firstName;
    }

    private void setLastName(String lastName){
        validateName(lastName);
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}
