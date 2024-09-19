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








