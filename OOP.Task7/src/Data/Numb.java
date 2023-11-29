package Data;


public class Numb {
    private double a;
    private double b;
    private String op;


    public Numb(double a, double b, String op) {
        this.a = a;
        this.b = b;
        this.op = op;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }


    @Override
    public String toString() {
        return "Numb{" +
                "a=" + a +
                ", op='" + op + '\'' +
                ", b=" + b +
                '}';
    }
}
