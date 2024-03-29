public class Truck extends  Cars implements  Loadable{
    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    private int cargoWeight;

    public Truck(String name, String model, Colors colors, float price, int cargoWeight, String engineType,String fuelType,String emissionType, String capacity,int cylinders) {
        super(name,model,colors,price,engineType,fuelType,emissionType,capacity,cylinders);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void LoadCargo(int weight) {
        cargoWeight += weight;
        System.out.println("Cargo loaded with " + weight +"KG");
    }

    @Override
    public void UnloadCargo() {
        System.out.println("Cargo unloaded with " + cargoWeight + "KG");
        cargoWeight =0;
    }
    public Truck(){}
}
