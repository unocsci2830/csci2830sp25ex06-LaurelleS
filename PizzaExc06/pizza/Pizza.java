package pizza;

import java.util.ArrayList;
import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.CheeseTopping;
import pizza.topping.PizzaTopping;



public class Pizza implements MenuItem {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private CheeseTopping cheese;
    private Double totPrice = 0.0;
    private ArrayList<PizzaTopping> toppings = new ArrayList<PizzaTopping>();
    private ArrayList<MenuItem> items = new ArrayList<MenuItem>();

    public Pizza(PizzaCrust crust, PizzaSauce sauce, CheeseTopping cheese, ArrayList<PizzaTopping> toppings) {
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;

        this.items.add(crust);
        this.items.add(sauce);
        this.items.add(cheese);
        for (PizzaTopping t : toppings) {
            this.toppings.add(t);
            this.items.add(t);
        }
    }
    public PizzaCrust getCrust() {
        return crust;
    }
    public PizzaSauce getSauce() {
        return sauce;
    }
    public CheeseTopping getCheese() {
        return cheese;
    }
    public ArrayList<PizzaTopping> getToppings() {
        return toppings;
    }
    @Override
    public Double getPrice() {
        Double totalPrice = 0.0;
        totalPrice += this.crust.getPrice();
        totalPrice += this.sauce.getPrice();
        for (PizzaTopping t : this.toppings) {
            totalPrice += t.getPrice();
        }
        return totalPrice;
    }
    public Double getTotalPrice() {
        for (MenuItem i : items) {
            this.totPrice += i.getPrice();
        }
        return this.totPrice;
    }
}