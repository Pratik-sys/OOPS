public class Rectangle extends Shape{
    private  int length;
    private  int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length =length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length* width;
    }
}
