public class Carss {
    private String name1;
    public void setName(String name1) {
        this.name1 = name1;
    }
    public void show() {
        String name;
        System.out.println("Name: " + name);
    }
}
public class ElectricCar extends Car {  }
public class Program {
    public static void main(String[] args) {
        Car33 car = new Car33();
        car.setName("Wheels");
        car.show();
        ElectricCar electricCar = new ElectricCar();
        electricCar.setName1("Lightning");
        electricCar.show();
    }
}