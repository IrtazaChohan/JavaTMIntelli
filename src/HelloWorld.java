import model.Dog;
import model.Person;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) { //psvm is keyboard shortcut
        System.out.println("Hello  - Nice to meet you!"); //sout is keyboard shortcut

        Person tom = new Person("Tom","Smith", LocalDate.of(1984,6,15),"10 Downing Street");
        Person janet = new Person("Janet","Jackson",LocalDate.of(1985,12,3),"Buckingham Palace");

        tom.setSpouse(janet);

        Dog fido = new Dog("Fido",LocalDate.of(2018,1,1));
        tom.setPet(fido);
        fido.bark();
        tom.setPet(fido);

        System.out.println(tom);

    }
}
