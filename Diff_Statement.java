//break statement
class BreakLoop {
    public static void main(String[] args) {
        for(int i=1; i<50; i++){
            System.out.println("i: "+i);
            if(i==5) break;
        }
        System.out.println("The loop is broken");
    }
}

// BreakGoto statement
class BreakGoto {
    public static void main(String[] args) {
        boolean t = true;
        
        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    
                    if (t) break second;
                    
                    System.out.println("This wont execute.");
                }
                System.out.println("This wont execute too.");
            }
            System.out.println("This is after the second block.");
        }
    }
}
