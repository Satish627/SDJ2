package adapter.PersonsInFile;

public interface PersonStorage {

    void addPerson(Person p);
    Person getPerson(int ssn );
}
