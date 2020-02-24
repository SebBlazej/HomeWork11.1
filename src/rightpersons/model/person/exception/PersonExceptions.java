package rightpersons.model.person.exception;


public abstract class PersonExceptions extends Exception {
    PersonExceptions(String message) {
        super(message);
    }

    public static void validateName(String name) throws NameUndefinedException {
        if(name == null || name.isEmpty()) throw new NameUndefinedException(null);
        else if(name.length() < 2) throw new NameUndefinedException(name);
    }

    public static void validateAge(int age) throws IncorrectAgeException {
        if(age < 2) throw new IncorrectAgeException(age);
    }
}
