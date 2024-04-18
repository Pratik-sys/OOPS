public class Capacities {
    private  int seatingCapacity;
    private String fuelCapacity;

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(String fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Capacities(int seatingCapacity, String fuelCapacity) {
        this.seatingCapacity = seatingCapacity;
        this.fuelCapacity = fuelCapacity;
    }
    public  Capacities(){};

    @Override
    public String toString() {
        return "Capacities{" +
                "seatingCapacity=" + seatingCapacity +
                ", fuelCapacity='" + fuelCapacity + '\'' +
                '}';
    }
}
