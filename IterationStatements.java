//while Loop
class While { 
    public static void main(String[] args) { 
        int n = 5; 
        
        while(n > 0) 
        {
            System.out.println("tick "+n); n--;
        }
    }
}    

//Do while Loop
class DoWhile { 
    public static void main(String[] args) {
        int n = 5; 
        do 
        {  
            System.out.println("tick "+n); n--; 
        } while(n > 0);
    }
}

//For Loop
class For { 
    public static void main(String[] args) {
        int n; 
        for(n=5; n>0; n--)
        { 
            System.out.println("tick "+n); 
        }
    }
}

// Foreach Loop
class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5}; 
        int sum = 0; 
        for(int n: nums) 
        {
            System.out.println("Value: "+n); sum += n;
        }
            System.out.println("Summation: "+sum);
    }
}
