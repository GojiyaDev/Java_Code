//Default Constructor
class Bike {
    // Constructor
    Bike() {
        System.out.println("Bike is created");
    }

    // Main method
    public static void main(String args[]) {
        // Creating an instance of Bike
        Bike b = new Bike();
    }
}

//Automatic Default  Constructor
class Student {
    int id;
    String name;

    // Method to display id and name
    void display() {
        System.out.println(id + " " + name);
    }

    // Main method
    public static void main(String args[]) {
        // Creating two Student objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Displaying the details of the students
        s1.display(); // Will print: "0 null"
        s2.display(); // Will print: "0 null"
    }
}

//Parameterized Constructor
class Student {
    int id;
    String name;

    // Constructor to initialize id and name
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Method to display id and name
    void display() {
        System.out.println(id + " " + name);
    }

    // Main method
    public static void main(String args[]) {
        // Creating two Student objects with different values
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");

        // Displaying the details of the students
        s1.display(); // Will print: "111 Karan"
        s2.display(); // Will print: "222 Aryan"
    }
}

//constructor overloading 
class Student {
    int id;
    String name;
    int age;

    // Constructor with two parameters (id and name)
    Student(int i, String n) {
        id = i;
        name = n;
        age = 0; // Default age if not provided
    }

    // Constructor with three parameters (id, name, and age)
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    // Method to display id, name, and age
    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    // Main method
    public static void main(String args[]) {
        // Creating Student objects with different constructors
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan", 25);

        // Displaying the details of the students
        s1.display(); // Will print: "111 Karan 0"
        s2.display(); // Will print: "222 Aryan 25"
    }
}
// Copy constructor
class Student {
    int id;
    String name;

    // Parameterized constructor to initialize id and name
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor to create a new object from an existing one
    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    // Method to display id and name
    void display() {
        System.out.println(id + " " + name);
    }

    // Main method
    public static void main(String args[]) {
        // Creating the first Student object
        Student s1 = new Student(111, "Karan");

        // Creating a second Student object by copying the first one
        Student s2 = new Student(s1);

        // Displaying the details of both students
        s1.display(); // Will print: "111 Karan"
        s2.display(); // Will print: "111 Karan"
    }
}
