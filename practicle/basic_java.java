class Person {
    public String name;
    public Person(String n){
        this.name = n;
    }
}

class Printer {
    void print(){
        System.out.println("APP is developed");  // Fixed typo
    }
}

public class basic_java {

    public static void main(String[] args) {
        Person person = new Person("Apple");  // Better naming
        Printer printer = new Printer();      // Better naming

        System.out.println(person.name);
        printer.print();  // Actually use the method
    }
}