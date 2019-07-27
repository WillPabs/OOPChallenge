public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger", "Whole Wheat",
                "Double Meat", 7.99);
        super.addHamburgerAddition1("Chips", .99);
        super.addHamburgerAddition2("Drink", 1.99);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can't add additional items to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can't add additional items to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can't add additional items to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can't add additional items to Deluxe Burger");
    }
}