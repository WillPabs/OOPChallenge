public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Whole Wheat", "Beef", 4.99);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Lettuce", .79);
        hamburger.addHamburgerAddition2("Tomato", .69);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthy = new HealthyBurger("Vegan Meat", 7.99);
        healthy.addHealthyAddition1("Avocado", 1.79);
        healthy.addHamburgerAddition2("Lettuce", .79);
        System.out.println("Total Burger Price is " + healthy.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();


    }
}
