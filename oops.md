# Object-Oriented Programming (OOPs) - Full Concept

## Table of Contents
1. [Introduction](#introduction)
2. [Core Concepts](#core-concepts)
3. [Four Pillars of OOPs](#four-pillars-of-oops)
4. [Class and Object](#class-and-object)
5. [Constructors](#constructors)
6. [Methods](#methods)
7. [Access Modifiers](#access-modifiers)
8. [Inheritance](#inheritance)
9. [Polymorphism](#polymorphism)
10. [Encapsulation](#encapsulation)
11. [Abstraction](#abstraction)
12. [Interfaces](#interfaces)
13. [Abstract Classes](#abstract-classes)

---

## Introduction

Object-Oriented Programming (OOPs) is a programming paradigm that uses objects and classes to structure code. It's based on the concept of bundling data (variables) and methods (functions) into objects.

**Advantages of OOPs:**
- Modularity and reusability
- Better code organization
- Easier maintenance
- Real-world modeling
- Security through encapsulation
- Flexibility through polymorphism

---

## Core Concepts

### What is an Object?
An object is an instance of a class that contains both data (attributes) and behavior (methods).

**Example:**
```java
StudentClass s1 = new StudentClass(12, "Tanmay");
// s1 is an object with age and name attributes
```

### What is a Class?
A class is a blueprint for creating objects. It defines the structure and behavior that objects will have.

**Example:**
```java
class StudentClass {
    int age;
    String name;
    
    public StudentClass(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
```

---

## Four Pillars of OOPs

### 1. Encapsulation
Encapsulation is the bundling of data (variables) and methods that operate on that data into a single unit (class), and hiding the internal details from the outside world.

**Benefits:**
- Data hiding
- Improved security
- Code maintainability
- Flexibility in implementation

**Example:**
```java
class Student {
    private int age;      // Private variable
    private String name;  // Private variable
    
    public int getAge() {        // Public getter
        return age;
    }
    
    public void setAge(int age) { // Public setter
        if(age > 0) {
            this.age = age;
        }
    }
}
```

### 2. Inheritance
Inheritance is a mechanism where a new class (child/derived class) inherits properties and methods from an existing class (parent/base class).

**Types of Inheritance:**
- Single Inheritance
- Multilevel Inheritance
- Multiple Inheritance (through interfaces in Java)
- Hierarchical Inheritance

**Example:**
```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
```

**Benefits:**
- Code reusability
- Establishes a hierarchy
- Supports polymorphism

### 3. Polymorphism
Polymorphism means "many forms". It allows objects to take multiple forms and functions to be called in different ways.

**Types:**
- **Compile-time (Method Overloading):** Same method name, different parameters
- **Runtime (Method Overriding):** Subclass provides a specific implementation of a parent class method

**Method Overloading Example:**
```java
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

**Method Overriding Example:**
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

### 4. Abstraction
Abstraction is the process of hiding complex implementation details and showing only the necessary features.

**Example:**
```java
abstract class Vehicle {
    abstract void drive();
    
    public void displayInfo() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving");
    }
}
```

---

## Class and Object

### Syntax:
```java
class ClassName {
    // Data members (variables)
    dataType variableName;
    
    // Methods
    returnType methodName(parameters) {
        // Method body
    }
}
```

### Creating Objects:
```java
ClassName objectName = new ClassName();
```

**Example:**
```java
class Student {
    int roll;
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();  // Creating object
        s1.roll = 101;
        s1.name = "John";
    }
}
```

---

## Constructors

A constructor is a special method that initializes objects. It has the same name as the class.

**Types:**
1. **Default Constructor** - No parameters
2. **Parameterized Constructor** - With parameters
3. **Copy Constructor** - Copies values from another object

**Rules:**
- Same name as class
- No return type
- Called automatically when object is created
- Can be overloaded

**Example:**
```java
class Student {
    int age;
    String name;
    
    // Parameterized Constructor
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    // Array of objects
    public Student(Student s) {  // Copy Constructor
        this.age = s.age;
        this.name = s.name;
    }
}
```

---

## Methods

Methods are functions defined inside a class that perform specific tasks.

**Syntax:**
```java
accessModifier returnType methodName(parameters) {
    // Method body
    return value;
}
```

**Types:**
1. **Instance Methods** - Called on objects
2. **Static Methods** - Belong to class, not objects
3. **Abstract Methods** - Only declaration, no implementation
4. **Final Methods** - Cannot be overridden

**Example:**
```java
class Student {
    int age;
    String name;
    
    // Instance method
    public void display() {
        System.out.println("Age: " + age + ", Name: " + name);
    }
    
    // Static method
    public static void schoolName() {
        System.out.println("ABC School");
    }
    
    // Method with return type
    public int getAge() {
        return age;
    }
}
```

---

## Access Modifiers

Access modifiers control the visibility of classes, methods, and variables.

| Modifier | Class | Package | Subclass | Outside |
|----------|-------|---------|----------|---------|
| public | ✓ | ✓ | ✓ | ✓ |
| protected | ✓ | ✓ | ✓ | ✗ |
| default | ✓ | ✓ | ✗ | ✗ |
| private | ✓ | ✗ | ✗ | ✗ |

**Example:**
```java
class Student {
    public int roll;      // Accessible everywhere
    protected int age;    // Accessible within package and subclasses
    int id;              // Accessible only within package (default)
    private String name; // Accessible only within the class
}
```

---

## Inheritance

Inheritance allows a class to inherit properties and methods from another class.

**Syntax:**
```java
class ChildClass extends ParentClass {
    // Child class code
}
```

**Example:**
```java
class Animal {
    String color;
    
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();    // Inherited method
        d.bark();   // Own method
    }
}
```

---

## Polymorphism

### Compile-time Polymorphism (Method Overloading)

Same method name with different parameters.

**Rules:**
- Different number of parameters
- Different type of parameters
- Different order of parameters

**Example:**
```java
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Runtime Polymorphism (Method Overriding)

Subclass provides implementation for a method already defined in parent class.

**Example:**
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();  // Output: Cat meows
        
        a = new Dog();
        a.sound();  // Output: Dog barks
    }
}
```

---

## Encapsulation

Wrapping data and methods into a single unit and hiding internal details.

**Best Practices:**
- Keep variables private
- Provide public getter and setter methods
- Add validation logic in setters

**Example:**
```java
class Student {
    private int age;
    private String name;
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if(age > 0 && age < 100) {
            this.age = age;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
}
```

---

## Abstraction

Hiding unnecessary details and showing only the important features.

**Uses:**
- Abstract Classes
- Interfaces

**Example:**
```java
abstract class Shape {
    abstract void draw();
    
    public void displayShape() {
        System.out.println("Drawing shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
```

---

## Interfaces

An interface is a contract that defines methods a class must implement.

**Characteristics:**
- Cannot be instantiated
- All methods are abstract (before Java 8)
- Supports multiple inheritance
- Methods are public by default

**Example:**
```java
interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
```

---

## Abstract Classes

A class that cannot be instantiated and may contain abstract methods.

**Characteristics:**
- Cannot create objects directly
- Can have both abstract and concrete methods
- Can have variables and methods with any access modifier
- Single inheritance only

**Example:**
```java
abstract class Vehicle {
    // Abstract method
    abstract void start();
    
    // Concrete method
    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}
```

---

## Key Differences

| Concept | Abstract Class | Interface |
|---------|---|---|
| Instantiation | Cannot | Cannot |
| Methods | Abstract + Concrete | Abstract only |
| Variables | Any access modifier | public static final |
| Inheritance | Single | Multiple |
| Keyword | abstract | interface |

---

## Summary

OOPs is a fundamental programming paradigm that helps in:
- Better code organization
- Code reusability through inheritance
- Flexibility through polymorphism
- Security through encapsulation
- Simplified complex problems through abstraction

Mastering these concepts is essential for writing efficient, maintainable, and scalable code.
