package ThisAndSuperTest;

class CSuper {
    public double x;
}

class CSub extends CSuper {
    public double x;

    public CSub(double new_x) {
        this.x = new_x;
        super.x = new_x * 10;
    }

    public double getSuper() {
        return super.x;
    }

    public double getSub() {
        return this.x;
    }
}

public class ThisAndSuperTest {
    public static void main(String[] args) {
        CSub sub = new CSub(10.0);
        System.out.println("Sub x: " + sub.getSub());
        System.out.println("Super x: " + sub.getSuper());
    }
}
