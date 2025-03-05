package pizza.sauce;
import pizza.MenuItem;

public abstract class PizzaSauce implements MenuItem {
    public abstract String toString();
    public String toNiceString() {
        return "Pizza Sauce: " + this.toString() + " Price: " + this.getPrice();
    }
    @Override
    public Double getPrice() {
        return 1.50;
    }
}