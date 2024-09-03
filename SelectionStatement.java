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
//if else
//checking which month come in which season
class IfElse{
    public static void main(String[] args) {
        
        int month = 4; //April
        String season;
        
        if((month==12)||(month==1)||(month==2))
        {
            season = "Winter";
        }
        else if((month==3)||(month==4)||(month==5))
        {
            season = "Spring";
        }
        else if((month==6)||(month==7)||(month==8))
        {
            season = "Summer";
        }
        else if((month==9)||(month==10)||(month==11))
        {
            season = "Autumn";
        }
        else
        {
            season = "Bogus month";
        }
        System.out.println("April is in the "+season+".");
    }
}
//Java Program to Determine Grade Based on Marks Using Switch Statement
class sample_switch{
    public static void main(String[] args) {
        int marks = 30;
        switch(marks/20) 
        {
            case(4):
                System.out.println("grade: "+'A');
                break;
            case(3):
                System.out.println("grade: "+'B');
                break;
            case(2):
                System.out.println("grade: "+'C');
                break;
            default:
                System.out.println("grade: "+'D');
        }
    }
}
