package rightpersons.model.person.exception;

class NameUndefinedException extends PersonExceptions {
    NameUndefinedException(String name) {
        super((name == null)?"Próbujesz podstawić null":"Długość wprowadzonego imienia/nazwiska = " + name.length());
    }
}
