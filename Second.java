//selection Statement 
//nested if else
class HelloWorld {
    public static void main(String[] args) {
        int i = 50;
        int a, b = 10, c = 0, d = 10, j = 10, k = 10;

        if (i == 10) {
            System.out.println("Entered outer if block: i == 10");

            if (j > 20) {
                a = b;
                System.out.println("Entered inner if block: j > 20");
            }

            if (k < 100) {
                c = d;
                System.out.println("Entered inner if block: k < 100");
            } else {
                a = c;
                System.out.println("Entered else block of inner if: k >= 100");
            }
        } else {
            a = d;
            System.out.println("Entered else block of outer if: i != 10");
        }
    }
}
