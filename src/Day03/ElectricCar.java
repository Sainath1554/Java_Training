package Day03;

public class ElectricCar extends Car {
    @Override
    public String engineType()
    {
        return "electric";
    }
    public String company()
    {
        return "Tesla";
    }
    public static void main(String[] args)
    {
        Car car = new ElectricCar();
        // Will invoke engineType method in Electric Car class
        System.out.println(car.engineType());

//        This will throw error as compiler cant see company method in car class
//        Car car2 = new ElectricCar();
//        System.out.println(car2.company());
        // Will invoke engineType method in Electric Car class
        ElectricCar car3 = new ElectricCar();
        System.out.println(car3.company());

    }
}
