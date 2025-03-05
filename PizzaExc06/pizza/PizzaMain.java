package pizza;
import java.util.*;
import pizza.crust.ThickCrust;
import pizza.crust.ThinCrust;
import pizza.crust.PizzaCrust;

import pizza.sauce.PizzaSauce;
import pizza.sauce.AlfredoSauce;
import pizza.sauce.TomatoSauce;

import pizza.topping.CheeseTopping;
import pizza.topping.cheese.Gorgonzola;
import pizza.topping.cheese.Mozzarella;
import pizza.topping.cheese.Parmesan;
import pizza.topping.cheese.Provolone;

import pizza.topping.PizzaTopping;
import pizza.topping.meat.Chicken;
import pizza.topping.meat.Hamburger;
import pizza.topping.meat.ItalianSausage;
import pizza.topping.meat.Pepperoni;

import pizza.topping.veggie.BellPeppers;
import pizza.topping.veggie.Mushrooms;
import pizza.topping.veggie.Onions;
import pizza.topping.veggie.Spinach;


public class PizzaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What kind of crust would you like?: ");
        System.out.println("1. Thick\n2. Thin");
        int cr = in.nextInt();
        System.out.println ("What should your crust be made of?: ");
        System.out.println("1. Flour\n2. Cauliflower");
        int type = in.nextInt();
        PizzaCrust crust;
        switch (cr) {
            case 1:
                System.out.println("Is your pizza Deep Dish?: ");
                System.out.println("1.Yes\n2. No");
                int iD = in.nextInt();
                boolean dd = (iD == 1) ? true : false;
                if (type == 1) {
                    crust = new ThickCrust("Flour", dd);
                }
                else {
                    crust = new ThickCrust("Cauliflower", dd);
                }
                break;
            default:
                if (type == 1) {
                    crust = new ThinCrust("Flour");
                }
                else {
                    crust = new ThinCrust("Cauliflower");
                }
        }
        in.close();

        System.out.println("What kind of sauce would you like?: ");
        System.out.println("1. Tomato\n2. Alfredo");
        int sc = in.nextInt();
        PizzaSauce sauce;
        switch (sc) {
            case 1:
                sauce = new TomatoSauce();
                break;
            default:
                sauce = new AlfredoSauce();
        }

        CheeseTopping cheese;
        System.out.println("Choose your cheese: ");
        System.out.println("1. Parmesan\n2. Mozzarella\n3. Gorgonzola\n4. Provolone");
        int ch = in.nextInt();
        switch (ch) {
            case 1:
                cheese = new Parmesan();
                break;
            case 2:
                cheese = new Mozzarella();
                break;
            case 3:
                cheese = new Gorgonzola();
                break;
            default:
                cheese = new Provolone();
            }

        // let the user choose as many toppings as they want 
        int top;
        ArrayList<PizzaTopping> tps = new ArrayList<PizzaTopping>();
        do {
            System.out.println("Choose your toppings: ");
            System.out.println("1. Italian Sausage\n2. Pepperoni\n3. Hamburger\n4. Chicken\n5. Mushrooms\n6. Bell Peppers\n7. Onions\n8. Spinach\n0. Done");
            top = in.nextInt();
            PizzaTopping t;
            switch(top) {
                case 1:
                    t = new ItalianSausage();
                    tps.add(t);
                    break; 
                case 2:
                    t = new Pepperoni();
                    tps.add(t);
                    break;
                case 3:
                    t = new Hamburger();
                    tps.add(t);
                    break;
                case 4:
                    t = new Chicken();
                    tps.add(t);
                    break;
                case 5:
                    t = new Mushrooms();
                    tps.add(t);
                    break;
                case 6:
                    t = new BellPeppers();
                    tps.add(t);
                    break;
                case 7:
                    t = new Onions();
                    tps.add(t);
                    break;
                case 8:
                    t = new Spinach();
                    tps.add(t);
                    break;
                default:
                    break;
            }
        } while (top != 0);
        
        // print out the pizza details
        Pizza p =  new Pizza(crust, sauce, cheese, tps);
        System.out.println("Your pizza has: ");
        System.out.println(p.getCrust().toNiceString());
        System.out.println(p.getSauce().toNiceString());
        System.out.println(p.getCheese().toNiceString());
        ArrayList<PizzaTopping> pt = p.getToppings();
        for (PizzaTopping t : pt) {
            System.out.println(t.toNiceString());
        }
        System.out.printf("%f\n", p.getTotalPrice());
        System.out.println(p.getCrust().checkIntegrity());
    }
    
}