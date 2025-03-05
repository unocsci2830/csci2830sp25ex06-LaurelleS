package pizza.crust;
import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    String type;

    public PizzaCrust(String type) {
        this.type = type;
    }
    public abstract String toString();
    public String toNiceString() {
        return "Pizza Crust: " + this.toString() + " Type: " + this.type + " Price: " + this.getPrice();
    }
    public abstract String checkIntegrity();
    
    @Override
    public Double getPrice() {
        return 2.0;
    }
}