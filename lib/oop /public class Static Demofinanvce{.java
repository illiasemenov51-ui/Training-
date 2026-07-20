public class StaticDemoFinance{
    static int a = 10; 
    static int b = 99;
    static void callme(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
public class StaticDemo1{
    public static void main(String args[]){
        StaticDemoFinance.callme();
        System.out.println("a = " + StaticDemoFinance.a);   
    }
}