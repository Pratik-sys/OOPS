public class Main {
    public static void main(String[] args) {
        Cars objCar = new Cars();
        Engine objEngine = new Engine();
        objCar.setName("Swift");
        objCar.setModel("ZXi + AMT");
        objCar.setColors(Colors.F8_GREEN);
        objCar.setPrice(120000);
        objCar.setEngineType("Advanced K Series Dual Jet, Dual VVT Engine");
        objCar.setFuelType("Gasoline");
        objCar.setEmissionType("BS VI");
        objCar.setCapacity("1197 cc");
        objCar.setCylinders(4);

        System.out.println(objCar.toString());
    }
}