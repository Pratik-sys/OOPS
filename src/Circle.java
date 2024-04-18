public class Circle extends Shape{
    private  float radius;


    public Circle(String color, float radius){
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
