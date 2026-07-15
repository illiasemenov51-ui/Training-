public class StaticDemo{
    static int a = 42;
    static int b = 99;
    static int callme(){
       System.out.println("a = " + a);
    }
}
public class Demo1 {
    public static void main(String[] args){

       StaticDemo.callme();
        System.out.print("b = " + StaticDemo.b);
    }
}