package rightpersons.model.person.exception;


public abstract class PersonExceptions extends RuntimeException {
    PersonExceptions(String message) {
        super(message);
    }

    public static void validateName(String name){
        if(name == null) throw new NameUndefinedException(null);
        else if(name.length() < 2) throw new NameUndefinedException(name);
    }

    public static void validateAge(int age){
        if(age < 2) throw new IncorrectAgeException(age);
    }
}
