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

//Continue Statement
class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            
            if (i % 2 == 0) {
                continue;
            }
            
            System.out.println("");
        }
    }
}

//Continue Label pattern 
class ContinueLabel {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
    }
}

//Return Statement
class Return {
    public static void main(String[] args) {
        boolean t = true;
        
        System.out.println("Before the return statement");
        
        if (t) {
            return; // Exits the method early
        }
        
        // This line will never be executed
        System.out.println("This won't execute.");
    }
}
