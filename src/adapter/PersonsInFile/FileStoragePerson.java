package adapter.PersonsInFile;

import java.io.*;

public class FileStoragePerson implements PersonStorage{

    private File file;
    private FileWriter fw;

    public FileStoragePerson(){
        file= new File("PersonStorage");

    }

    @Override
    public void addPerson(Person p) {
        try {
            fw= new FileWriter(file,true);

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Person existingPerson = getPerson(p.ssn);
        if (existingPerson != null) throw new IllegalStateException("Person already exists");
            String toWrite= p.ssn + ";" + p.name + ";" + p.dob;
        try {
            System.out.println("Adding person");
           fw.write(toWrite);
            System.out.println("Person added");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Person getPerson(int ssn) {
        BufferedReader reader;
        try {
            reader= new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null){
                String[] split = line.split(":");
                int tmpSSN = Integer.parseInt(split[0]);
                if (ssn== tmpSSN){
                    Person toReturn = new Person(split[1],tmpSSN,split[2]);
                    return toReturn;
                }
                line= reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
