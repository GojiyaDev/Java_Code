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
