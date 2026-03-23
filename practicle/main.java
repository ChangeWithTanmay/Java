class child {
    public void display(){
        System.out.println("This line is from base class");
    }
}

class Derived extends child {
    @Override
    public void display(){
        super.display();
        System.out.println("This line is from Derived class");
    }
}

public class main{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}
/* 
# Method overloading: If a multiple method having save name but diffent in parameter it is known as method overloading.

# Weys of overloading method: Method overloading can done by cchangeing 
1. The number of parameter in two methods.
2. The datatype of parameter of methods
3. The order of the paramether of the methods.
*/