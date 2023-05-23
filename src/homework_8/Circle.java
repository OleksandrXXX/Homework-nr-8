package homework_8;

public class Circle implements Figure {

    private static final String NAME = "Circle";

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return NAME;
    }

}