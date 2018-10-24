package pa04.main;

import java.io.File;
import java.io.IOException;
import pa04.model.Person;
import pa04.persistence.PersonJsonFileReader;
import pa04.persistence.PersonNativeFileReader;

public class ReadMain {
    
    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        Person person = 
                new PersonNativeFileReader(new File("maria.person")).read();
        System.out.println("Leyendo fichero binario");
        System.out.println("Person " + person.getName() + " nacida el "
                           + person.getBirthdate() 
                           + " recuperada desde disco");
        
        Person person1 = 
                new PersonJsonFileReader(new File("Maria.json")).read();
        System.out.println("\nLeyendo fichero json");
        System.out.println("Person " + person1.getName() + " nacida el " 
                           + person1.getBirthdate() 
                           + " recuperada desde disco");  
    }
}
