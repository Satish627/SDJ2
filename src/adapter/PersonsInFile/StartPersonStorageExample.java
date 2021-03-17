package adapter.PersonsInFile;

public class StartPersonStorageExample {

    public static void main(String[] args) {
        FileStoragePerson storage= new FileStoragePerson();
        UIPersonStorage uiPersonStorage= new UIPersonStorage(storage);
        uiPersonStorage.startUI();

    }
}
