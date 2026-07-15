public class CAR{
    public int numberOfDoors;
    public CAR(int doors){
        numberOfDoors = doors;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }
}

public class Main{
    public static void main(String[] args){
        CAR myCar = new CAR(4);
        System.out.println("My car has " + myCar.getNumberOfDoors() + " doors.");
    }
}