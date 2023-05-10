import model.Person;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) { //psvm is keyboard shortcut
        System.out.println("Hello  - Trying out the course even though this is basic!"); //sout is keyboard shortcut

        Person tom = new Person("Tom","Smith", LocalDate.of(1984,6,15));
    }
}
