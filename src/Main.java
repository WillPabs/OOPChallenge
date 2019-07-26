public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Hamburger", "Whole Wheat", "Beef", 4.99);
        System.out.println(hamburger.getHamburger());
        System.out.println(hamburger.getTotalPrice());
        hamburger.addHamburgerAddition1("Lettuce", .79);

        System.out.println("Total Price is: " + hamburger.getTotalPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getHamburger());



        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println(healthyBurger.getHamburger());
        System.out.println(healthyBurger.getTotalPrice());

        healthyBurger.addAvocado();
        healthyBurger.addHummus();
        System.out.println(healthyBurger.getTotalPrice());
    }
}
