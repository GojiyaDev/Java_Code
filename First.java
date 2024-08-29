/**
class HelloUPES{
  public static void main(String[] args){
  System.out.println("Hello UPES, How is the Josh?");
  }
}*/

//Size field in Wrapper Class
/**
class size{
  public static void main(String[] args){
    System.out.println("char " + Character.SIZE);
    System.out.println("byte " + Byte.SIZE);
    System.out.println("short " + Short.SIZE);
    System.out.println("int " + Integer.SIZE);
    System.out.println("long " + Long.SIZE);
    System.out.println("float " + Float.SIZE);
    System.out.println("double " + Double.SIZE);
    }
}*/

//Methods for Parsing
/**
class _parse{
    public static void main(String[] args){
        String str = "45";
        String str1 = "true";
        int a = Integer.parseInt(str);
        double d = Double.parseDouble(str);
        boolean b1 = Boolean.parseBoolean(str1);
        boolean b2 = Boolean.parseBoolean(str);
        System.out.print(a+" "+d+" "+b1+" "+b2);
    }
}
*/

//Methods for Conversion
/**
class _tostring{
  public static void main(String[] args){
    Integer a = 100;
    Double d = 67.23;
    Boolean b = true;
    String str = a.toString();
    System.out.println(str);
    str = d.toString();
    System.out.println(str);
    str = b.toString();
    System.out.print(str);
    }
}*/

//Methods for Formatting
/**
class radix{
  public static void main(String[] args){
    int a = 12;
    String str = Integer.toHexString(a);
    System.out.println(str);
    int b = Integer.parseInt(str, 16);
    System.out.println(b);
    System.out.println(Integer.parseInt("12", 8));
    System.out.println(Integer.parseInt("12", 10)); 
    }
}*/
//Static Field Example
/**
class B{
  int a = 0;
  void fun(){
    a++;
    }
}
class A{
  public static void main(String[] arg){
    B b1 = new B();
    b1.fun();
    B b2 = new B();
    b2.fun();
    B b3 = new B();
    b3.fun();
    System.out.println("a = "+ b1.a);
    System.out.println("a = "+ b2.a);
    System.out.println("a = "+ b3.a);
  }
}*/
