import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Taking Input From The User");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number First : ");
        int a = sc.nextInt();
        System.out.println("Enter Number Second : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The Sum Of these numbers is");
        System.out.println(sum);
    }
}
