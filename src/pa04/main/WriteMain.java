package pa04.main;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import pa04.model.Person;
import pa04.persistence.PersonNativeFileWriter;

public class WriteMain {

    public static void main(String[] args) throws IOException {
        Person person = new Person("Maria", LocalDate.of(2018, Month.MARCH, 1));
        File file = new File("maria.person");
        PersonNativeFileWriter pnfw = new PersonNativeFileWriter(file);
        pnfw.write(person);
        System.out.println("Person " + person.getName() + " saved!");
    }
    
}
