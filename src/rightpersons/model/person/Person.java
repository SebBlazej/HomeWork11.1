package rightpersons.model.person;

import rightpersons.model.person.exception.IncorrectAgeException;
import rightpersons.model.person.exception.NameUndefinedException;

import static rightpersons.model.person.exception.PersonExceptions.*;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private long pesel;

    public Person(){

    }

    public void setAge(int age) throws IncorrectAgeException {
        validateAge(age);
        this.age = age;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        validateName(firstName);
        this.firstName = firstName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        validateName(lastName);
        this.lastName = lastName;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
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
