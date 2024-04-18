
public class Engine extends Capacities{

    private String engineType;
    private  String fuelType;
    private String emissionType;
    private  String capacity;
    private  int cylinders;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEmissionType() {
        return emissionType;
    }

    public void setEmissionType(String emissionType) {
        this.emissionType = emissionType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public Engine() {}

    public Engine(String engineType, String fuelType, String emissionType, String capacity, int cylinders, int seatingCapacity, String fuelCapacity) {
        super(seatingCapacity, fuelCapacity);
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.emissionType = emissionType;
        this.capacity = capacity;
        this.cylinders = cylinders;
    }
    @Override
    public String toString() {
        return "Engine{" +
                "engineType='" + engineType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", emissionType='" + emissionType + '\'' +
                ", capacity='" + capacity + '\'' +
                ", cylinders=" + cylinders +
                '}' + "Capacities =" +  '\n' + super.toString();
    }
}
