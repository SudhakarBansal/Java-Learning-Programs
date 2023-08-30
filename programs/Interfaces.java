package programs;

interface Bicycle {
    void speedUp();

    void applyBreaks();
}

class AvonCycle implements Bicycle {
    @Override
    public void applyBreaks() {
        System.out.println("Breaks are applied....");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up the bicycle..");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle obj = new AvonCycle();
        obj.applyBreaks();
        obj.speedUp();
    }
}
