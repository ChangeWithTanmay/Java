# JAVA TUTORIAL

## Class

```java
class ABC{
    public static void main(String[] args){

    }
}
```

<h3>class ABC { ... }</h3>
Declares a class named ABC. Because it has no public modifier, the class is package-private.

<h3>public 🌐</h3>
Makes the main method accessible from outside the class (required so the JVM can call it).

<h3>static ⚙️</h3>
Means the method belongs to the class itself (no object instance needed). The JVM calls it without creating an ABC object.

<h3>void ❌🔁</h3>
The method does not return a value.

<h3>main 🚀</h3>
The standard method name recognized by the JVM as the program entry point.

<h3>(String[] args) 🧾</h3>
A parameter: an array of command-line arguments passed to the program (can also be written String... args).

<h3>{ ... } 🗂️</h3>
The method body — the code that runs when the program starts.