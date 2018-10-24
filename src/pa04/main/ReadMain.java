package pa04.main;

import java.io.File;
import java.io.IOException;
import pa04.model.Person;
import pa04.persistence.PersonNativeFileReader;

public class ReadMain {
    
    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        Person person = 
                new PersonNativeFileReader(new File("maria.person")).read();
        System.out.println("Person " + person.getName() + " nacida el "
                           + person.getBirthdate() + " recuperada desde disco");
    }
}
