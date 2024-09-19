//Simple inheritance
class A {
    int a = 10;
    int b = 20;
}

class B extends A {
    int c = 30;
    int d = 40;
}

class MainClass {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.a + " " + obj.b + " " + obj.c + " " + obj.d);
    }
}

// Inheritance
class A {
    int a, b;

    void input(int x, int y) {
        a = x;
        b = y;
    }
}

class B extends A {
    void show() {
        System.out.println(a + " " + b);
    }
}

class MainClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.input(10, 20);
        obj.show();
    }
}

// Member Access in Inheritance
class A {
    protected int a = 10;
    public int b = 20;
}

class B extends A {
    void show() {
        System.out.println(a + " " + b);
    }
}

class MainClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

// Constructors in Inheritance 
class A {
    A() {
        System.out.println("I am in Class A");
    }
}

class B extends A {
    B() {
        System.out.println("I am in Class B");
    }
}

class MainClass {
    public static void main(String[] args) {
        B obj = new B();
    }
}

// super: to refer to superclass member
class A {
    int a = 100, b = 200;
}

class B extends A {
    int a = 10, b = 20;

    void display() {
        System.out.printf("%d %d %d %d", a, b, super.a, super.b);
    }
}

class MainClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}

//Method Overriding
class A {
    void display() {
        System.out.println("I am in Class A");
    }
}

class B extends A {
    void display() {
        System.out.println("I am in Class B");
    }
}

class MainClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}

// Method Overriding
class A {
    void display() {
        System.out.println("I am in Class A");
    }
}

class B extends A {
    void display() {
        super.display(); // Call the superclass method
        System.out.println("I am in Class B");
    }
}

class MainClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.display(); // Calls the display method of B
    }
}












