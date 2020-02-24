package rightpersons.model.person.exception;

public class NameUndefinedException extends PersonExceptions {
    NameUndefinedException(String name) {
        super((name == null)?"Próbujesz podstawić pustą wartość":name + " - o długości " + name.length() + " - jest za krótkie");
    }
}
