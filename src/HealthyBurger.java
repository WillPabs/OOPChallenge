public class HealthyBurger extends Hamburger {

    HealthyBurger() {
        super("Healthy Burger", "Brown Rye",
                "Vegan Meat", 9.99);
    }

    public void addAvocado() {
        toppingPrice = 1.99;
        System.out.println("Added Avocado: " + toppingPrice);
        basePrice += toppingPrice;
    }

    public void addHummus() {
        toppingPrice = 1.49;
        System.out.println("Added Hummus: " + toppingPrice);
        basePrice += toppingPrice;
    }

    @Override
    public String getHamburger() {
        return "Healthy Burger";
    }
}
