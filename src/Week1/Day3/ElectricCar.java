package Week1.Day3;

public class ElectricCar extends Vehicle {
    @Override
    public String engineType()
    {
        return "electric";
    }
    public String brand()
    {
        return "BMW";
    }
    public static void main(String[] args)
    {
        Vehicle car = new ElectricCar();
        System.out.println(car.engineType());

//        This will throw error as compiler cant see company method in vehicle class
//        Vehicle car2 = new ElectricCar();
//        System.out.println(car2.brand());
        // Will invoke engineType method in Electric Car class
        ElectricCar car3 = new ElectricCar();
        System.out.println(car3.brand());
    }
}
