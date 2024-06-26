abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double calculateArea();

    void  display(){
        System.out.println("The color of the shape is :" + color);
    }
}
