public class Car1|{
    public int speed;
    public int getSpeed(){
        return speed;
    }
}
public class Main1{
    public static void main(String[] args){
        Car1 fastCar= new Car1();
        fastCar.speed =100; 
        System.out.println(fastCar.getSpeed());
    }
}