public class Cars extends  Engine {
    private String name;
    private  String model;
    private Colors colors;
    private  float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public Cars(){}

    public Cars(String name, String model, Colors colors, float price,
                String engineType,String fuelType,String emissionType, String capacity,int cylinders,
                int seatCapacity, String fuelCapacity) {
        super(engineType,fuelType,emissionType,capacity,cylinders, seatCapacity, fuelCapacity);
        this.name = name;
        this.model = model;
        this.colors = colors;
        this.price = price;
    }
    @Override
    public String toString() {
        return  "Cars{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", colors=" + colors +
                ", price=" + price +
                '}'+ '\n' + super.toString()  ;
    }
}
