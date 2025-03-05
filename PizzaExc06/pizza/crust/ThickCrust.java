package pizza.crust;

public class ThickCrust extends PizzaCrust {

    private boolean deepDish;

    public ThickCrust(String type, boolean deepDish) {
        super(type);
        this.deepDish = deepDish;
    }

    @Override
    public String toString() {
        return "Thick Crust";
    }
    @Override
    public String toNiceString() {
        String str;
        if (this.deepDish) {
            str = "Deep Dish";
        }
        else {
            str = "";
        }
        return "Pizza Crust: " + this.toString() + " Type: " + this.type + " " + str + " Price: " + this.getPrice();
    }
    @Override
    public String checkIntegrity() {
        if (this.type == "Cauliflower") {
            return "Handle carefully! This pizza is at risk of falling apart!";
        }
        return "";
    }
}