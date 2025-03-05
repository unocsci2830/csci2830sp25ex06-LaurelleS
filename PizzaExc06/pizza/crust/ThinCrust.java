package pizza.crust;

public class ThinCrust extends PizzaCrust {

    public ThinCrust(String type) {
        super(type);
    }
    @Override
    public String toString() {
        return "Thin Crust";
    }
    @Override
    public String checkIntegrity() {
        return "";
    }
}