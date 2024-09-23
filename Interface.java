//interface 1
interface A {
    int a = 10; // implicitly public, static, final
    void func(); // implicitly public, abstract
}

class B implements A {
    public void func() {
        System.out.println("B's implementation of func of interface A");
    }
}

class MainClass {
    public static void main(String[] args) {
        // A obj = new A(); // Error: Interfaces cannot be instantiated
        // A.a = 20; // Error: 'a' is final and cannot be reassigned

        B obj = new B();
        obj.func(); // Calls B's implementation of func()
        
        System.out.println("A.a = " + A.a); // Accesses the static final variable 'a' from interface A
    }
}
//interface 2
interface A {
    default void func() {
        System.out.println("This is a default method of interface A");
    }
}

class B implements A {}

class MainClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.func(); // Calls the default method func() from interface A
    }
}

//interface 3
interface A {
    void display(); // Interface method, implicitly public and abstract
}

class B implements A {
    public void display() {
        System.out.println("Class B implements interface A");
    }
}

class C implements A {
    public void display() {
        System.out.println("Class C implements interface A");
    }
}

class MainClass {
    public static void main(String[] args) {
        A obj1 = new B(); // obj1 is an instance of class B
        obj1.display();   // Calls B's implementation of display()

        A obj2 = new C(); // obj2 is an instance of class C
        obj2.display();   // Calls C's implementation of display()
    }
}
//interface 4
interface A {
    void display(); // Interface method, implicitly public and abstract
}

class B implements A {
    public void display() {
        System.out.println("Class B implements interface A");
    }
}

class C implements A {
    public void display() {
        System.out.println("Class C implements interface A");
    }
    
    void show() {
        System.out.println("This method is only of Class C");
    }
}

class MainClass {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.display(); // Calls B's implementation of display()

        A obj2 = new C();
        obj2.display(); // Calls C's implementation of display()

        // Cast obj2 to class C to access the show() method
        if (obj2 instanceof C) {
            ((C) obj2).show(); // Calls C's specific show() method
        }
    }
}
//Interface 5
class A {
    interface B {
        void interface_B();
    }
}

class C implements A.B {
    public void interface_B() {
        System.out.println("Interface nested inside class");
    }
}

class Nested_Interface1 {
    public static void main(String[] args) {
        C obj = new C();
        obj.interface_B();
    }
}

