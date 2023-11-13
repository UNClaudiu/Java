package Lab6;

public class Square extends Shape implements Exemplu {

    public Square(Integer l) {
        super(l);
    }

    @Override
    public double area() {
        return Double.valueOf(l*l);
    }

    @Override
    public Integer perimetru() {
        return l*4;
    }

    @Override
    public void methodExmplu() {

    }
}
