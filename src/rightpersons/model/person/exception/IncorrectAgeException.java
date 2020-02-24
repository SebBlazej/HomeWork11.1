package rightpersons.model.person.exception;

class IncorrectAgeException extends PersonExceptions {
    IncorrectAgeException(int age) {
        super("Wiek który podałeś wynosi - " + age +  " - wiek nie może być mniejszy niż 1");
    }
}
