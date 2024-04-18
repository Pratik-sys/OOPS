import com.opencsv.exceptions.CsvException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, CsvException {
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
        mytruck.setSeatingCapacity(4);
        mytruck.setFuelCapacity("37 L");
        mytruck.LoadCargo(500);

        System.out.println(mytruck);

        Cars objCar = new Cars();
        objCar.setName("Swift");
        objCar.setModel("ZXi + AMT");
        objCar.setColors(Colors.F8_GREEN);
        objCar.setPrice(120000);
        objCar.setEngineType("Advanced K Series Dual Jet, Dual VVT Engine");
        objCar.setFuelType("Gasoline");
        objCar.setEmissionType("BS VI");
        objCar.setCapacity("1197 cc");
        objCar.setCylinders(4);
        objCar.setSeatingCapacity(4);
        objCar.setFuelCapacity("37 L");

        System.out.println(objCar);

        Circle objCircle = new Circle("red", 5);
        objCircle.display();
        System.out.println("Area of a Circle is : " + objCircle.calculateArea());
        
        Rectangle objeRectangle = new Rectangle("blue", 12, 12);
        objeRectangle.display();
        System.out.println("Area of the Rectangle : " + objeRectangle.calculateArea());


    }
}