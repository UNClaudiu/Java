package Lab6;

public class Triangle extends Shape {

    public Triangle(Integer l) {
        super(l);
    }

    @Override
    public double area() {
        return (Math.sqrt(3)/4)*l*l;
    }

    @Override
    public Integer perimetru() {
        return l*3;
    }
}
