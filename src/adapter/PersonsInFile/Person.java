package adapter.PersonsInFile;

public class Person {


    public String name;
    public int ssn;
    public String dob;

    public Person(String name, int ssn, String dob) {
        this.name = name;
        this.ssn = ssn;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", ssn=" + ssn +
                ", dob='" + dob + '\'' ;
    }
}
