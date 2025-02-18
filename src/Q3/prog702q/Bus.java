package Q3.prog702q;

public class Bus extends Vietcongle {
    private final String myCity;
    private final String type;

    public Bus(String name, int tires, String city) {
        super(name, tires, 50000);
        myCity = city;
        type = "Bus";
    }

    public String getHome() {
        return myCity;
    }

    public String getType() {
        return type;
    }
}
