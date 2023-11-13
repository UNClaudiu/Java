package Lab6;

public abstract class Shape {

    protected Integer l;

    public Shape(Integer l){
        this.l =l;
    }

    public abstract double area();

    public abstract Integer perimetru();

    public void desen(){
        System.out.println("Area of shape "+ area());
        System.out.println("Perimeter shape "+ perimetru());
    }

    public static void afiseazaceva(){
        System.out.println("Ceva");
    }

}
