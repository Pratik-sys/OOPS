public class Main {
    public static void main(String[] args) {
        Cars objCar = new Cars();
        Engine objEngine = new Engine();
        Truck mytruck = new Truck();
        mytruck.setName("Swift");
        mytruck.setModel("ZXi + AMT");
        mytruck.setColors(Colors.F8_GREEN);
        mytruck.setPrice(120000);
        mytruck.setEngineType("Advanced K Series Dual Jet, Dual VVT Engine");
        mytruck.setFuelType("Gasoline");
        mytruck.setEmissionType("BS VI");
        mytruck.setCapacity("1197 cc");
        mytruck.setCylinders(4);
        mytruck.LoadCargo(500);

        System.out.println(mytruck);
    }
}